package Pattern;

public class NumPattern2 {
    public static void main(String[] args) {
        int row=5,col=5;
        int ch1=4;

        for (int i=0 ; i<row ; i++){
            int ch2=ch1;
            for (int j=0 ; j<col ; j++){
                System.out.print(ch2--+" ");
                if (ch2<0){
                    ch2=0;
                }
            }
            System.out.println();
            ch1--;
        }
    }
}
