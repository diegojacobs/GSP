import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class Predicate {
	private String name;
    private ArrayList<String> params;
    private ArrayList<Integer> paramsReplaced;

    public Predicate(String name) {
        this.params = new ArrayList<String>();
        this.paramsReplaced = new ArrayList<Integer>();
        this.name = name;
        if (name.contains("(")) {
            if (name.contains("^")) {
                String[] ids = name.split("\\^");
                this.name = name;
                for (int i = 0; i < ids.length;i++) {
                    String newId = ids[i];
                    String id = newId.substring(newId.indexOf("(")+1, newId.indexOf(")"));
                    this.params.addAll(Arrays.asList(id.split(",")));
                }
            } else {
                this.name = name.substring(0, name.indexOf("("));
                String id = name.substring(name.indexOf("(")+1, name.indexOf(")"));
                this.params.addAll(Arrays.asList(id.split(",")));
            }
        }
           
        
    }
    
    public Predicate clone(){
        Predicate p = new Predicate(this.getName());
        p.setParams((ArrayList<String>)this.getParams().clone());
        return p;
    }
    
    public boolean valid(int j) {
        return !this.paramsReplaced.contains(j);
    }
    
    public void addParamReplaced(int j) {
        this.paramsReplaced.add(j);
    }
    
    public void clearParamsReplaced() {
        this.paramsReplaced.clear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfParams() {
        return params.size();
    }
    
    public void setParams(ArrayList<String> params) {
        this.params = params;
    }

    public ArrayList<String> getParams() {
        return params;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.params);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Predicate other = (Predicate) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.params, other.params)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name + "(" + params + ")";
    }
}
