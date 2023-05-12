package PatternDemo;

public class SpyRange {
    public static void main(String[] args) {
        for (int i=10 ; i<=10000 ; i++){
            int num=i,sum=0,mult=1;

            while (num!=0){
                int r=num%10;
                sum+=r;
                mult*=r;
                num/=10;
            }
            if (sum==mult){
                System.out.print(" "+i);
            }
        }
    }
}
