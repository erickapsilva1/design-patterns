package observer;

public class ExtraDiscountTest {

    public static void main(String[] args) {
        Budget budget = new Budget(500.0);

        budget.applyExtraDiscount();

        System.out.println(budget.getValue());

        budget.approve();
        budget.applyExtraDiscount();

        System.out.println(budget.getValue());

        budget.complete();
        budget.applyExtraDiscount();
    }



}
