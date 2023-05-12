package PatternDemo;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i=1 ; i<=100 ; i++){
            int num=i, count=0;
            for (int j=1 ; j<=num ; j++){
                if (num%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(" "+num);
            }
        }
    }
}
