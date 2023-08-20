package state;

public interface StateOfABudget {

    void applyExtraDiscount(Budget budget);

    void approve(Budget budget);
    void reprove(Budget budget);
    void complete(Budget budget);

}
