package visitor;

public class Sum implements Expression {

    private Expression left;
    private Expression right;

    public Sum(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        int leftValue = left.evaluate();
        int rightValue = right.evaluate();
        return leftValue + rightValue;
    }

    @Override
    public void accept(PrinterVisitor printer) {
        printer.visitSum(this);
    }

    public Expression getLeft(){
        return this.left;
    }

    public Expression getRight(){
        return this.right;
    }

}
