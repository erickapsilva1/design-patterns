package state;

public class TaxCalculator {

    public void calculate(Budget budget, Tax anyTax) {

        double tax = anyTax.calculate(budget);
        System.out.println(tax);

    }

}
