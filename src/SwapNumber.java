package GitBash;

public class SwapNumber {
    public  static void main(String [] args)
    {
        int a=10;
        int b=20;
        System.out.println("before swapping:  "+a+"  "+b);
        int t=a;
        a=b;
        b=t;
        System.out.println("After swapping: "+a+"    "+b);
    }
}
