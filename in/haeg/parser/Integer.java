import in.haeg.parser.Expression;

blic class Integer extends Expression {
    
    private int number;
    
    public Integer(int number) {
        this.number = number;
    }
    
    public getResult(Context context) {
        return (java.lang.Integer)number;
    }
}