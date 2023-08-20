package state;

public class Reproved implements StateOfABudget {
    @Override
    public void applyExtraDiscount(Budget budget) {
        throw new RuntimeException("Reproved budgets cannot receive extra discounts.");
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("Reproved budget cannot be approved.");
    }

    @Override
    public void reprove(Budget budget) {
        throw new RuntimeException("Budget already reproved.");
    }

    @Override
    public void complete(Budget budget) {
        budget.currentState = new Completed();
    }
}
