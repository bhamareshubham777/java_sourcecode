package PatternDemo;

public class BuzzNumber {
    public static void main(String[] args) {
        int num=157;

        if (num%10==7 || num%7==0){
            System.out.println("GIVEN NUMBER IS BUZZ");
        }else {
            System.out.println("GIVEN NUM IS NOT BUZZ");
        }
    }
}
