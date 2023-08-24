package visitor;

public class PrinterVisitor {

    public void visitSum(Sum sum){
        System.out.print("(");

        // left
        sum.getLeft().accept(this);

        System.out.print(" + ");

        // right
        sum.getRight().accept(this);

        System.out.print(")");
    }

    public void visitSubtraction(Subtraction subtraction){
        System.out.print("(");

        // left
        subtraction.getLeft().accept(this);

        System.out.print(" - ");

        // right
        subtraction.getRight().accept(this);

        System.out.print(")");
    }

    public void visitNumber(Number number){
        System.out.print(number.getNumber());
    }

}
