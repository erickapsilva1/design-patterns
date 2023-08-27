package facade_singleton;

public class CompanyFacade {

    protected CompanyFacade(){

    }

    public Customer searchCustomer(String cpf){
        Customer customer = new CustomerDao().searchByCpf();
        return customer;
    }

    public Invoice createInvoice(Customer customer, double value){
        Invoice invoice = new Invoice(customer, value);
        return invoice;
    }

    public Billing createBilling(Billing billing){
        billing = new Billing(Type.BOLETO, null);
        billing.issue();
        return billing;
    }

    public ContactCustomer performContact(Customer customer, Invoice invoice){
        ContactCustomer contact = new ContactCustomer(customer, invoice);
        contact.dispatch();
        return contact;
    }



}
