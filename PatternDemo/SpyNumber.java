package PatternDemo;

public class SpyNumber {
    public static void main(String[] args) {
        int num=1124;
        int sum=0,mult=1;
        while (num!=0){
            int r=num%10;
            sum+=r;
            mult*=r;
            num/=10;
        }
        if (sum==mult){
            System.out.println("GIVEN NUM IS SPY");
        }
    }
}
