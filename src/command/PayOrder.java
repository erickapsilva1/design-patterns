package command;

public class PayOrder implements Command {

    private Order order;

    public PayOrder(Order order){
        this.order = order;
    }

    @Override
    public void execute() {
        order.pay();
    }
}
