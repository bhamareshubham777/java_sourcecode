package PatternDemo;

public class FibonacciRecursion {
     int n1=0,n2=1,n3;
    public static void main(String[] args) {
       new FibonacciRecursion().fibonacci(10);
    }
     void fibonacci(int a){
        if (a>=0){
            System.out.print(" "+n1);
            n3=n1+n2;
            n1=n2;
            n2=n3;

            a--;
            fibonacci(a);
        }
    }
}
