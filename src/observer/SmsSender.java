package observer;

public class SmsSender implements ActionAfterGenerateInvoice {
    public void execute(Invoice invoice) {
        System.out.println("Sent by SMS");
    }
}
