package command;

import java.util.Calendar;

public class Order {

    private String customer;
    private double value;
    private Status status;
    private Calendar endDate;

    public Order(String customer, double value) {
        this.customer = customer;
        this.value = value;
        this.status = Status.NEW;
    }

    public void pay(){
        status = Status.PAID;
    }

    public void complete(){
        endDate = Calendar.getInstance();
        status = Status.DELIVERED;
    }
}
