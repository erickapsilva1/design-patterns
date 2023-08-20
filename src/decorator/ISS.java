package decorator;

public class ISS extends Tax {

    public ISS(Tax otherTax){
        super(otherTax);
    }

    public ISS(){

    }

    @Override
    public double calculate(Budget budget) {
        return budget.getValue() * 0.06 + otherTaxCal(budget);
    }

    public double otherTaxCal(Budget budget){
        return otherTax.calculate(budget);
    }
}
