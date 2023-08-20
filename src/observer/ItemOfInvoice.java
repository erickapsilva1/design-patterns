package observer;

public class ItemOfInvoice {

    private String name;
    private double value;

    public ItemOfInvoice(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
