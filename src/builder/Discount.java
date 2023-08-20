package builder;

public interface Discount {
    double discount(Budget budget);
    void setNext(Discount next);
}
