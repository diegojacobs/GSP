import java.util.ArrayList;
import java.util.Stack;


public class GSP<T> {
	private State initialState;
    private State goalState;
    private ArrayList<Action> actions;
    
    public GSP(State init, State goal, ArrayList<Action> actions) {
        this.initialState = init;
        this.goalState = goal;
        this.actions = actions;
    }
    
    public void Solve() {
        ArrayList<String> plan = new ArrayList<String>();
        Stack<T> stack = new Stack<T>();
        System.out.println(this.initialState);
        System.out.println(this.goalState);
        
        for (Predicate pred: this.goalState.getState()) {
            stack.push((T)pred);
        }
        while(!stack.isEmpty()) {
            T actualValue = (T)stack.pop();
            if (actualValue.getClass().getName().equals("gsp.Predicate")) {
                Predicate p = (Predicate)actualValue;
                if (statePredicate(p)) {
                    continue;
                }
                
                for (Action a: getRelevantAction(p)){
                    stack.push((T)a);
                     //push preconditions
                    for (Predicate precondition: a.getPreconditions()) {
                        //push each precondition
                        stack.push((T)precondition);
                    }
                }
            }
            else {
                plan.add((String)actualValue);
            }
        }
    }
    
    public boolean statePredicate(Predicate p) {
        for(Predicate stateP: this.initialState.getState()) 
            if (stateP.equals(p))
                return true;
        
        return false;
    }
    
    public ArrayList<Action> getRelevantAction(Predicate p) {
        ArrayList<Action> ac = new ArrayList<Action>();
       
        ArrayList<Action> cloned = new ArrayList<Action>();
        
        for(Action a : this.actions)
            cloned.add(a.cloneCustom());
        
        for (Action a: cloned) 
        {
            ArrayList<Predicate> eff = a.getEffects();
            for (Predicate effect: eff) 
                if (effect.getIdentifier().equals(p.getIdentifier()) && effect.getCantParams() == p.getCantParams())
                {
                    String id = p.getIdentifier();
                    modifyAction(a.getPreconditions(), p, a.getParams());
                    modifyAction(a.getEffects(), p, a.getParams());
                    a.setParams(p.getParams());
                    ac.add(a);
                }
        }
        
        return ac;
    }
    
    
    public void modifyAction(ArrayList<Predicate> predicates, Predicate p, ArrayList<String> action_params) {
        ArrayList<String> newParams = p.getParams();
        
        for (Predicate predicate: predicates) 
        {
            for (int i = 0; i < action_params.size(); i++) 
                for (int j = 0; j < predicate.getParams().size();j++) 
                    if ( predicate.getParams().get(j).equals(action_params.get(i)) && predicate.valid(j)) 
                    {
                        predicate.getParams().set(j, newParams.get(i));
                        predicate.addEvalIndex(j);
                    }
            
            predicate.clearEval();
        }
    }
}
