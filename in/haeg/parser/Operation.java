import in.haeg.parser.Expression;

blic abstract class Operation extends Expression {
    // represents a mathematical operation with two arguments
    
    private Expression left;
    private Expression right;
    
    public Operation(String leftArg, String rightArg, Parser parser) {
        left = parser.parse(leftArg);
        right = parser.parse(rightArg)
    }
}