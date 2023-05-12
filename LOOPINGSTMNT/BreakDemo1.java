package LOOPINGSTMNT;

public class BreakDemo1 {
    public static void main(String[] args) {

        for(int a = 1;a <= 10;a++){
            if(a==5){
                break;
            }
            System.out.println(a);
        }

        for(int b = 1;b <= 10;b++){
            if(b==5){
                continue;
            }
            System.out.println(b);
        }
    }
}
