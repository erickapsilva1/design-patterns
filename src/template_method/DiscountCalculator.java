package template_method;

public class DiscountCalculator {

    public double calculate(Budget budget){

        Discount discount = new DiscountByMoreThenFiveItems();
        Discount discount1 = new DiscountByMoreThenFiveHundredReais();
        Discount discount2 = new NoDiscount();

        discount.setNext(discount1);
        discount1.setNext(discount2);

        return discount.discount(budget);

    }
}
