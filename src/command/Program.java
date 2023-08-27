package command;

public class Program {
    public static void main(String[] args) {

        Order order1 = new Order("Luna", 199);
        Order order2 = new Order("Neb", 854);

        WorkQueue queue = new WorkQueue();
        queue.add(new PayOrder(order1));
        queue.add(new PayOrder(order2));
        queue.add(new FinishOrder(order1));

        queue.process();

    }
}
