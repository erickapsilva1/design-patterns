package observer;

public abstract class ConditionalTaxTemplate extends Tax {
    @Override
    public double calculate(Budget budget) {
        if(mustUseMaxTax(budget)){
            return maxTax(budget) + otherTaxCal(budget);
        }else{
            return minTax(budget) + otherTaxCal(budget);
        }
    }

    public abstract boolean mustUseMaxTax(Budget budget);

    public abstract double maxTax(Budget budget);

    public abstract double minTax(Budget budget);
}
