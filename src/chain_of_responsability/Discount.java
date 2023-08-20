package chain_of_responsability;

public interface Discount {
    double discount(Budget budget);
    void setNext(Discount next);
}
