package Array;

public class SumIs70 {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50,60};

        for (int a : arr) {
            for (int b : arr) {
                if (a+b == 70){
                    System.out.println(a+" "+b);
                }
            }
        }
    }
}
