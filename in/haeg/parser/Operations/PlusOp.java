import in.haeg.parser.Operation;

public class PlusOp extends Operation {
    
    public PlusOp(String leftArg, String rightArg, Parser parser) {
        super(leftArg, rightArg, parser);
    }
    
    public getResult(Context context) {
        return left.getResult(context) + right.getResult(context);
    }
    
}