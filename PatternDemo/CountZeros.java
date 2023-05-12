package PatternDemo;

public class CountZeros {
    public static void main(String[] args) {
        int num=111000400;
        int count=0;

        while (num!=0){
            int r=num%10;
            if (r==0){
                count++;
            }
            num/=10;
        }
        System.out.println("No of Zeros in given num are: "+count);
    }
}
