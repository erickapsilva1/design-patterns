package observer;

import java.util.Calendar;
import java.util.List;

public class Invoice {

    private String companyName;
    private String cnpj;
    private Calendar issueDate;
    private double grossValue;
    private double taxes;
    public List<ItemOfInvoice> items;
    public String notes;

    public Invoice(String companyName, String cnpj, Calendar issueDate, double grossValue, double taxes,
                   List<ItemOfInvoice> items, String notes) {
        this.companyName = companyName;
        this.cnpj = cnpj;
        this.issueDate = issueDate;
        this.grossValue = grossValue;
        this.taxes = taxes;
        this.items = items;
        this.notes = notes;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Calendar getIssueDate() {
        return issueDate;
    }

    public double getGrossValue() {
        return grossValue;
    }

    public double getTaxes() {
        return taxes;
    }

    public List<ItemOfInvoice> getItems() {
        return items;
    }

    public String getNotes() {
        return notes;
    }
}
