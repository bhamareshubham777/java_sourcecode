package PatternDemo;

public class BuzzRange {
    public static void main(String[] args) {
        for (int i=1 ; i< 1000 ; i++){
            int num=i;

            if (num%10==7 || num%7==0){
                System.out.print(" "+num);
            }
        }
    }
}
