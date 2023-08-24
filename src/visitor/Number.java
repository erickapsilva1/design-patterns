package visitor;

public class Number implements Expression {

    private int number;

    public Number(int number){
        this.number = number;
    }

    @Override
    public int evaluate() {
        return number;
    }

    @Override
    public void accept(PrinterVisitor printer) {
        printer.visitNumber(this);
    }

    public int getNumber(){
        return this.number;
    }

}
