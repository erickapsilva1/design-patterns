package interpreter;

public class Program {

    public static void main(String[] args) {

        Expression left = new Subtraction(new Number(10), new Number(5));
        Expression right = new Sum(new Number(2), new Number(10));
        Expression sum = new Sum(left, right);

        int result = sum.evaluate();

        System.out.println(result);
    }

}
