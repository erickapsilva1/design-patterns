package observer;

public class UnderApproval implements StateOfABudget {

    public void applyExtraDiscount(Budget budget){
        budget.value -= budget.value * 0.05;
    }

    @Override
    public void approve(Budget budget) {
        budget.currentState = new Approved();
    }

    @Override
    public void reprove(Budget budget) {
        budget.currentState = new Reproved();
    }

    @Override
    public void complete(Budget budget) {
        throw new RuntimeException("Budgets under approval cannot go directly to completed stage.");
    }

}
