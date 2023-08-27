package facade_singleton;

public class Program {
    public static void main(String[] args) {

        CompanyFacade companyFacade = new CompanyFacadeSingleton().getInstance();
        companyFacade.searchCustomer("123");
        companyFacade.createBilling(null);

    }
}
