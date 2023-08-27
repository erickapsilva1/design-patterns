package command;

public class FinishOrder implements Command {

    private Order order;

    public FinishOrder(Order order){
        this.order = order;
    }

    @Override
    public void execute() {
        order.complete();
    }
}
