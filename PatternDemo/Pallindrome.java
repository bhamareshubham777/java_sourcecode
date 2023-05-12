package PatternDemo;

public class Pallindrome {
    public static void main(String[] args) {
        int num=121;
        int temp=num;
        int sum=0;

        while (num!=0){
            int digit=num%10;
            sum=sum*10+digit;
            num=num/10;
        }
        if (sum==temp){
            System.out.println("NUMBER IS PALLINDROME");
        }else {
            System.out.println("NUMBER IS NOT PALLINDROME");
        }
    }
}
