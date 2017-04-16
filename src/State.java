import java.util.ArrayList;


public class State {
	private ArrayList<Predicate> state;
    private ArrayList<String> blocks;
    private String statement;

    public State() {
        this.state = new ArrayList<Predicate>();
        blocks = new ArrayList<String>();
    }

    public ArrayList<Predicate> getState() {
        return state;
    }

    public void addState(Predicate state) {
        this.state.add(state);
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public ArrayList<String> getBlocks() {
        return blocks;
    }

    public void addBlock(String str) {
        this.blocks.add(str);
    }
       
    @Override
    public String toString() {
        return "State{ " + "state = " + state + ", blocks = " + blocks + '}';
    }
}
