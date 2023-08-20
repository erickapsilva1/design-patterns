package decorator;

public class DiscountTest {
    public static void main(String[] args) {

        DiscountCalculator discountCalculator = new DiscountCalculator();

        Budget budget = new Budget(500);
        budget.addItem(new Item("Pencil", 15.78));
        budget.addItem(new Item("Paper", 198.0));
        budget.addItem(new Item("Erase", 18.0));
        budget.addItem(new Item("Crayon", 20.0));
        budget.addItem(new Item("Sharpener", 99.99));
        budget.addItem(new Item("Pen", 25.0));

        double finalDiscount = discountCalculator.calculate(budget);

        System.out.println(finalDiscount);

    }
}
