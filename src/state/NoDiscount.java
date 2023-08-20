package state;

public class NoDiscount implements Discount {
    @Override
    public double discount(Budget budget) {
        return 0;
    }

    @Override
    public void setNext(Discount next) {
        // it doesn't have
    }
}
