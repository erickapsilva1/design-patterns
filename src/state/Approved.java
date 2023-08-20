package state;

public class Approved implements StateOfABudget {

    public void applyExtraDiscount(Budget budget){
        budget.value -= budget.value * 0.02;
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("Budget already approved");
    }

    @Override
    public void reprove(Budget budget) {
        throw new RuntimeException("Budget already approved cannot be reproved.");
    }

    @Override
    public void complete(Budget budget) {
        budget.currentState = new Completed();
    }

}
