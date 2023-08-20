package observer;

public class Printer implements ActionAfterGenerateInvoice {
    public void execute(Invoice invoice) {
        System.out.println("Printed");
    }
}
