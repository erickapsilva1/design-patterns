package state;

public class TaxCalculatorTax {
    public static void main(String[] args) {

        Budget budget = new Budget(1000.95);

        ICMS icms = new ICMS();
        ISS iss = new ISS();

        TaxCalculator taxCalculator = new TaxCalculator();

        taxCalculator.calculate(budget, icms);
        taxCalculator.calculate(budget, iss);

    }
}
