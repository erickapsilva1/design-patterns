package chain_of_responsability;

public class DiscountByMoreThenFiveItems implements Discount {

    private Discount next;

    public double discount(Budget budget){
        if(budget.getItems().size() > 5){
            return budget.getValue() * 0.01;
        }else{
            return next.discount(budget);
        }
    }

    @Override
    public void setNext(Discount next) {
        this.next = next;
    }
}
