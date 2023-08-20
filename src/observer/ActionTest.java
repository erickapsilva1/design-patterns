package observer;

public class ActionTest {
    public static void main(String[] args) {
        InvoiceBuilder invoiceBuilder = new InvoiceBuilder();

        invoiceBuilder.addAction(new EmailSender());
        invoiceBuilder.addAction(new InvoiceDao());
        invoiceBuilder.addAction(new SmsSender());
        invoiceBuilder.addAction(new Printer());

        Invoice invoice = invoiceBuilder
                .toCompany("Capsule Co.")
                .withCnpj("321")
                .withItem(new ItemOfInvoice("Test", 25))
                .withNotes("Note!!")
                .inCurrentDate()
                .build();

        System.out.println(invoice.getGrossValue());

    }
}
