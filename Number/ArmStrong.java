package Number;

public class ArmStrong {
    public static void main(String[] args) {
        for (int i=1 ; i<=10000 ; i++){
            int num=i, tempNum=num;
            int count=0,sum=0;

            while (num!=0){
                count++;
                num/=10;
            }
            while (tempNum!=0){
                int r=tempNum%10;
                int pow=1;
                for (int j=1 ; j<=count ;j++){
                    pow*=r;
                }
                sum+=pow;
                tempNum/=10;
            }
            if (sum==i){
                System.out.print(sum+" ");
            }
        }
    }
}
