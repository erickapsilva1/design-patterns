package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InvoiceBuilder {

    private String companyName;
    private String cnpj;
    private List<ItemOfInvoice> allItems = new ArrayList<ItemOfInvoice>();
    double grossValue;
    double tax;
    private String notes;
    private Calendar date;

    public InvoiceBuilder toCompany(String companyName){
        this.companyName = companyName;
        return this;
    }
    
    public InvoiceBuilder withCnpj(String cnpj){
        this.cnpj = cnpj;
        return this;
    }

    public InvoiceBuilder withItem(ItemOfInvoice item){
        allItems.add(item);
        grossValue += item.getValue();
        tax += item.getValue() * 0.05;
        return this;
    }

    public InvoiceBuilder withNotes(String notes){
        this.notes = notes;
        return this;
    }

    public InvoiceBuilder inCurrentDate(){
        this.date = Calendar.getInstance();
        return this;
    }

    public Invoice build(){
        return new Invoice(companyName, cnpj, date, grossValue, tax, allItems, notes);
    }
    
}
