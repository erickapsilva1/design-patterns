package visitor;

public interface Expression {

    int evaluate();
    void accept(PrinterVisitor printer);

}
