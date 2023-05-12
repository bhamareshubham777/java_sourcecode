package PatternDemo;

public class Palindrome2 {
    public static void main(String[] args) {
        for (int i=10 ; i<=1000 ; i++){
            int temp=i,sum=0,temp2=temp;
            while (temp!=0){
                int r=temp%10;
                sum=sum*10+r;
                temp=temp/10;
            }
            if (temp2==sum){
                System.out.println(sum);
            }
        }
    }
}
