package Number;

public class Factorial {
    public static void main(String[] args) {
        for (int i=1 ; i<=50 ; i++){
            int num=i;
            long fact=1;
            for (int j=1 ; j<=num ; j++){
                fact*=j;
            }
            System.out.print(" "+fact);
        }
    }
}
