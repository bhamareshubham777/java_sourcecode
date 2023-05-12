package PatternDemo;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);

        System.out.println("ENTER NUMBER");
        int no=sc1.nextInt();

        isStrongNum(no);
    }
    static void isStrongNum(int num){
        int tempNum=num,sum=0;
        while (num!=0){
            int digit=num%10;
            sum+=factorial(digit);
            num/=10;
        }
        if (tempNum==sum){
            System.out.println("GIVEN NUMBER IS STRONG NUMBER");
        }else {
            System.out.println("GIVEN NUMBER IS NOT STRONG NUMBER");
        }
    }
    static int factorial(int digit){
        int fact=1;
        for (int i=1 ; i<=digit ; i++){
            fact*=i;
        }
        return fact;
    }
}
