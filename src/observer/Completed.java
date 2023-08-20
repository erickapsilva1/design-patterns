package observer;

public class Completed implements StateOfABudget {
    @Override
    public void applyExtraDiscount(Budget budget) {
        throw new RuntimeException("Completed budgets cannot receive extra discounts.");
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("Budget already completed.");
    }

    @Override
    public void reprove(Budget budget) {
        throw new RuntimeException("Budget already completed.");
    }

    @Override
    public void complete(Budget budget) {
        throw new RuntimeException("Budget already completed.");
    }
}
