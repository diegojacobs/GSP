import java.util.ArrayList;
import java.util.Arrays;


public class Action {
	private String id;
    private ArrayList<String> params;
    private ArrayList<Predicate> preconditions;
    private ArrayList<Predicate> effects;
    private String newId;

    public Action(String id) {
        this.id = id;
        this.preconditions = new ArrayList<Predicate>();
        this.effects = new ArrayList<Predicate>();
        this.params = new ArrayList<String>();
        if (id.contains("(")) {
            if (id.contains("^")) {
                String[] ids = id.split("\\^");
                this.id = id;
                for (int i = 0; i < ids.length;i++) {
                    String newId = ids[i];
                    String id2 = newId.substring(newId.indexOf("(")+1, newId.indexOf(")"));
                    this.params.addAll(Arrays.asList(id2.split(",")));
                }
            } else {
                this.id = id.substring(0, id.indexOf("("));
                String id2 = id.substring(id.indexOf("(")+1, id.indexOf(")"));
                this.params.addAll(Arrays.asList(id2.split(",")));
            }
        }
    }
    
    
    public Action cloneCustom() {
        Action clone = new Action(this.getId());
        
        clone.setParams(this.getParams());
        clone.setPreconditions(this.getPreconditions());
        clone.setEffects(this.getEffects());
        clone.setNewId(this.getNewId());
        
        return clone;
    }

    public void setPreconditions(ArrayList<Predicate> preconditions) {
        this.preconditions = preconditions;
    }

    public void setEffects(ArrayList<Predicate> effects) {
        this.effects = effects;
    }
    
    public void addPrecondition(Predicate precondition) {
        this.preconditions.add(precondition);
    }
    
    public void addEffect(Predicate effect) {
        this.effects.add(effect);
    }
    
    public void addParam(String str) {
        this.params.add(str);
    }

    public void setParams(ArrayList<String> params) {
        this.params = params;
    }
    
    public ArrayList<String> getParams() {
        return params;
    }
    
    public String getId() {
        return id;
    }

    public ArrayList<Predicate> getPreconditions() {
        return preconditions;
    }

    public ArrayList<Predicate> getEffects() {
        return effects;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNewId() {
        return newId;
    }

    public void setNewId(String newId) {
        this.newId = newId;
    }
    
    @Override
    public String toString() {
        return "Actions{" + "id=" + id + "\n"+
               "preconditions=" + preconditions + "\n" +
               "effects=" + effects + '}';
    }
}
