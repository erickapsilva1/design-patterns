package state;

public class ICPP extends ConditionalTaxTemplate {

    @Override
    public boolean mustUseMaxTax(Budget budget) {
        return budget.getValue() > 500;
    }

    @Override
    public double maxTax(Budget budget) {
        return budget.getValue() * 0.07;
    }

    @Override
    public double minTax(Budget budget) {
        return budget.getValue() * 0.05;
    }
}
