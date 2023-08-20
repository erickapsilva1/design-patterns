package template_method;

public abstract class ConditionalTaxTemplate implements Tax {
    @Override
    public double calculate(Budget budget) {
        if(mustUseMaxTax(budget)){
            return maxTax(budget);
        }else{
            return minTax(budget);
        }
    }

    public abstract boolean mustUseMaxTax(Budget budget);

    public abstract double maxTax(Budget budget);

    public abstract double minTax(Budget budget);
}
