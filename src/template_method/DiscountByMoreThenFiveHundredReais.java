package template_method;

public class DiscountByMoreThenFiveHundredReais implements Discount {

    private Discount next;

    public double discount(Budget budget){
        if(budget.getValue() > 500){
            return budget.getValue() * 0.07;
        }else{
            return next.discount(budget);
        }
    }

    @Override
    public void setNext(Discount next) {
        this.next = next;
    }
}
