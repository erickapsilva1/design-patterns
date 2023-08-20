package template_method;

public interface Discount {
    double discount(Budget budget);
    void setNext(Discount next);
}
