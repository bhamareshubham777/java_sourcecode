package PatternDemo;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num=153, tempNum=num;
        int sum=0;

        while (num!=0){
            int r=num%10;
            sum=sum+(r*r*r);
            num/=10;
        }
        if (sum==tempNum){
            System.out.println("GIVEN NUMBER IS ARMSTRONG");
        }
        else {
            System.out.println("GIVEN NUM IS NOT PALLINDROME");
        }
    }
}
