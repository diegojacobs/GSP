import java.util.ArrayList;


public class VisitorGSP extends GSPBaseVisitor<Object> {
	private ArrayList<Predicate> predicates;
    private ArrayList<Action> actions;
    private State initialState;
    private State goalState;
    private Action currentAction;
    
    public VisitorGSP() {
        this.predicates = new ArrayList<Predicate>();
        this.initialState = new State();
        this.goalState = new State();
        this.actions = new ArrayList<Action>();
    }
    
    @Override
    public Object visitSingular_predicate(GSPParser.Singular_predicateContext ctx) {
        String pred = ctx.getText();
        this.predicates.add(new Predicate(pred));

        return super.visitSingular_predicate(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInitial_state(GSPParser.Initial_stateContext ctx) {
        String initial = ctx.getChild(1).getText();
        String[] initials = initial.split("\\^");
        this.initialState.setStatement(initial);
        
        for (int i = 0; i < initials.length; i++) {
            String actual = initials[i];
            this.initialState.addState(new Predicate(actual));
        }
        
        return super.visitInitial_state(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitGoal_state(GSPParser.Goal_stateContext ctx) {
        String goal = ctx.getChild(1).getText();
        String[] initials = goal.split("\\^");
        this.goalState.addState(new Predicate(goal));
        for (int i = 0; i < initials.length; i++) {
            String actual = initials[i];
            this.goalState.addState(new Predicate(actual));
           
        }
        return super.visitGoal_state(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSingular_action(GSPParser.Singular_actionContext ctx) {
        this.currentAction = new Action(ctx.getChild(1).getText()+ctx.getChild(2).getText()+ctx.getChild(3).getText()+ctx.getChild(4).getText());
        for (int i = 0; i < ctx.getChildCount(); i++) {
            visit(ctx.getChild(i));
        }
        this.actions.add(currentAction);
        return null;
    }

    @Override
    public Object visitPrecond(GSPParser.PrecondContext ctx) {
        
        String precond_initial = ctx.getChild(1).getText();
        Predicate pred = new Predicate(precond_initial);
        this.currentAction.addPrecondition(pred);
        String[] precon = precond_initial.split("\\^");
        for (int i = 0; i < precon.length; i++) {
            this.currentAction.addPrecondition(new Predicate(precon[i]));
        }
        
        return super.visitPrecond(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitEffects(GSPParser.EffectsContext ctx) {
        String effect_initial = ctx.getChild(1).getText();
        this.currentAction.addEffect(new Predicate(effect_initial));
        String[] eff = effect_initial.split("\\^");
        for (int i = 0; i < eff.length; i++) {
            this.currentAction.addEffect(new Predicate(eff[i]));
        }
        return super.visitEffects(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    public State getInitialState() {
        return initialState;
    }

    public State getGoalState() {
        return goalState;
    }
    
    public ArrayList<Predicate> getPredicates() {
        return predicates;
    }

    public void setPredicates(ArrayList<Predicate> predicates) {
        this.predicates = predicates;
    }
    
    public ArrayList<Action> getActions() {
        return actions;
    }
}
