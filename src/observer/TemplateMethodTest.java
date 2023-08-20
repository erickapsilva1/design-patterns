package observer;

public class TemplateMethodTest {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        ICPP icpp = new ICPP();
        IKCV ikcv = new IKCV();

        Budget budget = new Budget(510);
        budget.addItem(new Item("Pencil", 15.78));
        budget.addItem(new Item("Paper", 198.0));
        budget.addItem(new Item("Erase", 18.0));
        budget.addItem(new Item("Crayon", 20.0));
        budget.addItem(new Item("Sharpener", 99.99));
        budget.addItem(new Item("Pen", 25.0));

        System.out.println("Max Tax for ICPP: " + icpp.mustUseMaxTax(budget));
        if(icpp.mustUseMaxTax(budget)){
            System.out.println(icpp.maxTax(budget));
        }else{
            System.out.println(icpp.minTax(budget));
        }

        System.out.println("Max Tax for IKV: " + ikcv.mustUseMaxTax(budget));
        if(ikcv.mustUseMaxTax(budget)){
            System.out.println(ikcv.maxTax(budget));
        }else{
            System.out.println(ikcv.minTax(budget));
        }


    }
}
