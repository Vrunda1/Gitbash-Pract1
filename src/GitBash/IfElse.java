package GitBash;

public class IfElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String x = "Hi";
        ;
        String y = "  world";
        System.out.println(x + y);
        System.out.println(x + y + a + b);
        System.out.println(x + y + (a + b));

        if (b > a) {
            System.out.println("b is greter than a");
        } else {
            System.out.println("a is grater than b");
        }

    }
}
