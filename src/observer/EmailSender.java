package observer;

public class EmailSender implements ActionAfterGenerateInvoice {
    public void execute(Invoice invoice) {
        System.out.println("Sent by email");
    }
}
