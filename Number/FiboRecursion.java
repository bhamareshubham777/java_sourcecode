package Number;

public class FiboRecursion {

    public static void main(String[] args) {
        int count=10;
        fibonacci(count);
    }
    static int n1=0,n2=1,n3;
    static void fibonacci(int count){
        if (count>=0) {
            System.out.print(" "+n1);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            count--;
            fibonacci(count);
        }
    }
}
