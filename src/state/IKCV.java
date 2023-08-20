package state;

public class IKCV extends ConditionalTaxTemplate {

    @Override
    public boolean mustUseMaxTax(Budget budget) {
        return budget.getValue() > 500 && hasItemGreaterThanOneHundredReais(budget);
    }

    @Override
    public double maxTax(Budget budget) {
        return budget.getValue() * 0.1;
    }

    @Override
    public double minTax(Budget budget) {
        return budget.getValue() * 0.06;
    }

    private boolean hasItemGreaterThanOneHundredReais(Budget budget) {
        for(Item item : budget.getItems()){
            if (item.getValue() > 100) return true;
        }
        return false;
    }

}
