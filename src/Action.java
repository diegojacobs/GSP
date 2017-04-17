import java.util.ArrayList;
import java.util.Arrays;


public class Action {
	private String name;
    private ArrayList<String> params;
    private ArrayList<Predicate> preconditions;
    private ArrayList<Predicate> effects;
    private String newName;

    public Action(String name) {
        this.name = name;
        this.preconditions = new ArrayList<Predicate>();
        this.effects = new ArrayList<Predicate>();
        this.params = new ArrayList<String>();
        if (name.contains("(")) {
            if (name.contains("^")) {
                String[] names = name.split("\\^");
                this.name = name;
                for (int i = 0; i < names.length;i++) {
                    String newName = names[i];
                    String id = newName.substring(newName.indexOf("(")+1, newName.indexOf(")"));
                    this.params.addAll(Arrays.asList(id.split(",")));
                }
            } else {
                this.name = name.substring(0, name.indexOf("("));
                String id = name.substring(name.indexOf("(")+1, name.indexOf(")"));
                this.params.addAll(Arrays.asList(id.split(",")));
            }
        }
         
    }
    
    
    public Action clone() {
        Action cloned = new Action(this.getName());
        cloned.setParams((ArrayList<String>)this.getParams().clone());
        ArrayList<Predicate> newPred = new ArrayList<Predicate>();
        for (Predicate preconditions: this.getPreconditions()) {
            newPred.add(preconditions.clone());
        }
        ArrayList<Predicate> newEff = new ArrayList<Predicate>();
        for (Predicate effc: this.getEffects()) {
            newEff.add(effc.clone());
        }
        cloned.setPreconditions(newPred);
        cloned.setEffects(newEff);
        cloned.setNewName(this.getNewName());
        return cloned;
    }
    
    public void addPreconditions(Predicate precond) {
        this.preconditions.add(precond);
    }
    
    public void setPreconditions(ArrayList<Predicate> precond) {
        this.preconditions = precond;
    }
    
    public ArrayList<Predicate> getPreconditions() {
        return preconditions;
    }
    
    public void setEffects(ArrayList<Predicate> effects) {
        this.effects = effects;
    }
    
    public void addEffect(Predicate effect) {
        this.effects.add(effect);
    }
    
    public ArrayList<Predicate> getEffects() {
        return effects;
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
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @Override
    public String toString() {
        return name + "(" + params + ")";
    }
}
