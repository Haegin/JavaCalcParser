import java.util.HashMap;

public class Context {
    
    private HashMap<String,Integer> variables = new HashMap<String, Integer>();
    
    public Context() {
    }
    
    public bindVariable(String variable, Integer value) {
        variables.put(variable, value);
    }
    
    public lookup(String variable) {
        return variables.get(variable);
    }
}