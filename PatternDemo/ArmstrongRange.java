package PatternDemo;

public class ArmstrongRange {
    public static void main(String[] args) {
        for (int i=10 ; i<=10000 ; i++){
            int num=i, tempNum=num, count=0;

            while (num!=0){
                count++;
                num/=10;
            }
            int sum=0;

            while (tempNum!=0){
                int pow=1;
                int r=tempNum%10;
                for (int j=1 ; j<=count ; j++){
                    pow*=r;
                }
                sum=sum+pow;
                tempNum/=10;
            }
            if (sum==i){
                System.out.print(" "+sum);
            }
        }
    }
}
