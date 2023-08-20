package observer;

public class InvoiceDao implements ActionAfterGenerateInvoice {
    public void execute(Invoice invoice) {
        System.out.println("Saved in Database");
    }
}
