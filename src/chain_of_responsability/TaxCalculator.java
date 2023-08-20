package chain_of_responsability;

public class TaxCalculator {

    public void calculate(Budget budget, Tax anyTax) {

        double tax = anyTax.calculate(budget);
        System.out.println(tax);

    }

}
