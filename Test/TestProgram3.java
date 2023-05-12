package Test;

public class TestProgram3 {
    public static void main(String[] args) {
        int row=5;
        int col=5;
        char ch1='A';

        for (int i=0 ; i<row ; i++){
            char ch2=ch1;
            for (int j=0 ; j< col ; j++){
                System.out.print(ch2);
            }
            System.out.println();
            if (i<2){
                ch1++;
            }else {
                ch1--;
            }
        }
    }
}
