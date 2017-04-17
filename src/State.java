import java.util.ArrayList;
import java.util.HashSet;


public class State {
	private ArrayList<Predicate> state;
    private String statement;
    private HashSet<String> blocks;

    public State() {
        this.state = new ArrayList<Predicate>();
        blocks = new HashSet<String>();
    }
    
    public State cloneCustom() {
        State st = new State();
        st.setState(this.getState());
        return st;
    }

    public ArrayList<Predicate> getState() {
        return state;
    }

    public void addState(Predicate state) {
        this.state.add(state);
    }
    public void addState(ArrayList<Predicate> state) {
        this.state.addAll(state);
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public void setState(ArrayList<Predicate> state) {
        this.state = state;
    }

    public ArrayList<String> getBlocks() {
        return new ArrayList<String>(blocks);
    }

    public void addBlock(String bl) {
        this.blocks.add(bl);
    }
    
    public void findBlocks() {
        for (Predicate p : this.getState()) {
            for (String st : p.getParams()) {
                this.blocks.add(st);
            }
        }
    }
    
    @Override
    public String toString() {
        return "State{" + "state = " + state + '}';
    }
}
