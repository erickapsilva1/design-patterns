package decorator;

public class ComplexTaxTest {
    public static void main(String[] args) {
        Tax iss = new ISS(new ICMS(new IKCV()));

        Budget budget = new Budget(500);

        double value = iss.calculate(budget);

        System.out.println(value);
    }
}
