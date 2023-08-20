package chain_of_responsability;

public class ICMS implements Tax {

    @Override
    public double calculate(Budget budget) {
        return budget.getValue() * 0.1;
    }
}
