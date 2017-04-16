import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class Predicate {
	private String id;
    private ArrayList<String> params;
    private ArrayList<Integer> evaluated;

    public Predicate(String identifier) 
    {
        this.params = new ArrayList<String>();
        this.evaluated = new ArrayList<Integer>();
        this.id = identifier;
    
        if (identifier.contains("(")) 
        {
            if (identifier.contains("^")) 
            {
                String[] ids = identifier.split("\\^");
                this.id = identifier;
                for (int i = 0; i < ids.length;i++) 
                {
                    String newId = ids[i];
                    String id = newId.substring(newId.indexOf("(") + 1, newId.indexOf(")"));
                    this.params.addAll(Arrays.asList(id.split(",")));
                }
            } 
            else 
            {
                this.id = identifier.substring(0, identifier.indexOf("("));
                String id = identifier.substring(identifier.indexOf("(") + 1, identifier.indexOf(")"));
                this.params.addAll(Arrays.asList(id.split(",")));
            }
        }
    }
    
    public boolean valid(int j) {
        return !this.evaluated.contains(j);
    }
    
    public void addEvalIndex(int j) {
        this.evaluated.add(j);
    }
    
    public void clearEval() {
        this.evaluated.clear();
    }

    public String getIdentifier() {
        return id;
    }

    public void setIdentifier(String identifier) {
        this.id = identifier;
    }

    public int getCantParams() {
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
        hash = 13 * hash + Objects.hashCode(this.id);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.params, other.params)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Predicate{" + "id = " + id + ", params = " + params +'}';
    }
}
