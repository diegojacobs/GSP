import java.util.ArrayList;
import java.util.Stack;


public class GSP<T> {
	private State initialState;
    private State goalState;
    private ArrayList<Action> plan;
    private ArrayList<Action> actions;
    private Stack<T> stack;
    
    public GSP(State init, State goal, ArrayList<Action> actions) {
        this.initialState = init;
        this.goalState = goal;
        this.actions = actions;
        this.plan = new ArrayList<Action>();
        this.stack = new Stack<T>();
        this.initialState.findBlocks();
    }
    
    
    public void Solve() {
    	try{
	        for (Predicate predicate: this.goalState.getState()) {
	            stack.push((T)predicate);
	        }
	        
	        while(!stack.isEmpty()) {
	            T actualValue = (T)stack.pop();
	            
	            if (actualValue.getClass().getName().equals("Predicate")) {
	                Predicate predicate = (Predicate)actualValue;
	                if (!statePredicate(predicate)) {
		                Action a = getNextAction(predicate);
	                    stack.push((T)a);
	                    for (Predicate precondition: a.getPreconditions()) {
	                        stack.push((T)precondition);    
	                    }
	                }
	            }
	            else {
	                Action actualAction = (Action)actualValue;
	                ArrayList<Predicate> copyState = new ArrayList<Predicate>();
	                for(Predicate p : this.initialState.getState())
	                    copyState.add(p.clone());
	                for (Predicate prAc: this.initialState.getState()) {
	                    for (Predicate precond: actualAction.getPreconditions()) {
	                        if (precond.equals(prAc)){
	                            copyState.remove(precond);
	                        }        
	                    }
	                }
	                
	                for (Predicate effect: actualAction.getEffects()) {
	                    if (!copyState.contains(effect) && !effect.getName().contains("^") && !effect.getName().contains("!")){
	                        copyState.add(effect);
	                    }
	                }
	                
	                this.initialState.setState(copyState);
	                this.initialState.findBlocks();
	                
	                for (String block: this.initialState.getBlocks()) {
	                    boolean clear = true; 
	                    for (Predicate curState: this.initialState.getState()) {
	                        if (curState.getName().equals("on")) {
	                            if (curState.getParams().get(1).equals(block)) {
	                                clear = false;
	                            }
	                        }
	                    }
	                    
	                    if (clear && !block.isEmpty()) {
	                        Predicate newP = new Predicate("clear(" + block + ")");
	                        if (!copyState.contains(newP))
	                            copyState.add(newP);
	                    }
	                }
	                
	                this.initialState.setState(copyState);
	                plan.add((Action)actualValue);
	            }
	        }
	        
	        System.out.println("Plan: ");
	        for(Action action : this.plan)
	        	System.out.println(action);
    	}
    	catch (Exception e){
    		System.out.println("Unable to solve this problem.");
    	}
    }
    
    public boolean statePredicate(Predicate predicate) {
        for(Predicate stateP: this.initialState.getState()) {
            if (stateP.equals(predicate) || predicate.getName().contains("^")){
                return true;
            }
        }
        return false;
    }
    
    public Action getNextAction(Predicate predicate) {
        Action nextAction = null;
        ArrayList<Action> cloned = new ArrayList<Action>();
        
        for(Action a : this.actions)
            cloned.add(a.clone());
        
        Action action = null;
        if (predicate.getName().equals("on")) {
            action = cloned.get(0);
        }
        
        if (predicate.getName().equals("onTable") || predicate.getName().equals("AE")) {
            action = cloned.get(3);
        }
        
        if (predicate.getName().equals("hold")) {
            action = cloned.get(2);
            if (!isAE(action)) {
                action = cloned.get(1);     
            }
        }
        if (predicate.getName().equals("clear")) {
            action = cloned.get(3);
            if (!isAE(action)) {
                action = cloned.get(1);
            }
        }
        
        ArrayList<Predicate> eff = action.getEffects();
        for (Predicate effect: eff) {
            if (effect.getName().equals(predicate.getName()) && effect.getNumberOfParams() == predicate.getNumberOfParams()){
                if (modifyActionParams(action, predicate, action.getPreconditions()) && modifyActionParams(action, predicate, action.getEffects())){
                    action.setParams(predicate.getParams());
                    nextAction = action;
                }
            }
        }
        
        return nextAction;
    }
    
    public boolean isAE(Action a){
        ArrayList<Predicate> eff = a.getPreconditions();
        boolean valid = true;
        for (Predicate effect: eff) {
            boolean innerValid = false;
            if (effect.getName().contains("^")) {
                continue;
            }
            for (Predicate currenState: initialState.getState()){
                if (effect.equals(currenState)){
                    innerValid = true;
                }
            }
            
            if (innerValid == false) {
                valid = false;
            }

        }
        return valid;
    }
    
    
    public boolean modifyActionParams(Action action, Predicate predicate, ArrayList<Predicate> predicates) {
        ArrayList<String> action_params = action.getParams();
        ArrayList<String> newParams = predicate.getParams();
        
        if (newParams.size() != action_params.size()) {
            ArrayList<Predicate> predicatesSatisfy = new ArrayList<Predicate>();
            ArrayList<String> rep = new ArrayList<String>();
            ArrayList<Predicate> repeated = new ArrayList<Predicate>();
            for (Predicate precondition: action.getPreconditions()) {
                for (Predicate prState: initialState.getState()) {
                    if (precondition.getName().equals(prState.getName())) {
                        if (rep.contains(prState.getName())) {
                            repeated.add(prState);
                            int iR = -1;
                            for (int i = 0; i <  predicatesSatisfy.size();i++) {
                                if ( predicatesSatisfy.get(i).getName().equals(prState.getName())) {
                                    iR = i;
                                }
                            }
                            if (iR != -1) {
                                Predicate removed = predicatesSatisfy.remove(iR);
                                repeated.add(removed);
                            }
                        } else {
                            predicatesSatisfy.add(prState);
                            rep.add(prState.getName());
                        }
                    }
                }
            }
            
            if (action.getPreconditions().size() - 1 > predicatesSatisfy.size() + repeated.size()) {
                return false;
            }
            
            ArrayList<Predicate> valid = new ArrayList<Predicate>();
            if (action.getName().equals("Unstack")) {
                for (Predicate satisfy: predicatesSatisfy) {
                    for (Predicate reped: repeated) {
                        ArrayList<String> sParams = satisfy.getParams();
                        ArrayList<String> rParams = reped.getParams();
                        if ((reped.getName().equals("clear") && satisfy.getName().equals("on") )||
                            (reped.getName().equals("on") && satisfy.getName().equals("clear") )) {
                            if (sParams.get(0).equals(rParams.get(0))) {
                                valid.add(reped);
                            }
                            
                        }
                    }
                }
                predicatesSatisfy.addAll(valid);
                boolean reInsert = true;
                for (Predicate sat: predicatesSatisfy) {
                    if (sat.getParams().containsAll(predicate.getParams())) {
                        reInsert = false;
                    }
                }
                if (reInsert == true) {
                    stack.add((T)predicate);
                }
                
                if (predicatesSatisfy.size() == action.getPreconditions().size() - 1) {
                    
                    for (Predicate validated : predicatesSatisfy) {
                        if (validated.getName().equals("on")) {
                            newParams = validated.getParams();
                            predicate.setParams(newParams);
                        }
                    }
                }
            }
            
            
          
        }
        
        if (!newParams.equals(action_params)) {
            for (Predicate precond: predicates) {
                for (int i = 0; i < action_params.size(); i++) {
                    for (int j = 0; j < precond.getParams().size();j++) {
                        if ( precond.getParams().get(j).equals(action_params.get(i)) && precond.valid(j)) {
                            precond.getParams().set(j, newParams.get(i));
                            precond.addParamReplaced(j);
                        }
                    }
                }
                precond.clearParamsReplaced();
            }
        }
        
        return true;
    }
}
