import in.haeg.Expression;

public class Variable extends Expression {
    
    private String name;
    
    public Variable(String name) {
        this.name = name;
    }
    
    public getResult(Context context) {
        return context.lookup(name);
    }
}