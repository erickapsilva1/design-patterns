package observer;

public class InvoiceTest {
    public static void main(String[] args) {

        InvoiceBuilder builder = new InvoiceBuilder();
        builder.toCompany("Dunder Mifflin")
                .withCnpj("12.345.678/0001-23")
                .withItem(new ItemOfInvoice("Item 1", 100))
                .withItem(new ItemOfInvoice("Item 2", 200))
                .withItem(new ItemOfInvoice("Item 3", 300))
                .withNotes("Notes...")
                .inCurrentDate();

        Invoice invoice = builder.build();
        System.out.println(invoice.getGrossValue());
    }
}
