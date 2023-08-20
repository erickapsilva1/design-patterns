package state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {

    protected double value;
    private final List<Item> items;

    protected StateOfABudget currentState;


    public Budget(double value){
        this.value = value;
        items = new ArrayList<Item>();
        currentState = new UnderApproval();
    }

    public double getValue() {
        return value;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void applyExtraDiscount() {
        currentState.applyExtraDiscount(this);
    }

    public void approve(){
        currentState.approve(this);
    }

    public void reprove(){
        currentState.reprove(this);
    }

    public void complete(){
        currentState.complete(this);
    }

}
