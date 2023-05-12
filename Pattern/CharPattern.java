package Pattern;

public class CharPattern {
    public static void main(String[] args) {
        int row=12;
        int col=6;

        char ch1='F';
        char ch2='F';

        for (int i=0 ; i<row ; i++){
            ch1=ch2;
            for (int j=0 ; j<col ; j++){
                System.out.print(ch1-- +" ");
            }
            System.out.println();

            if(i<5) {
                ch2--;
                col--;
            }else if(i>5){
                ch2++;
                col++;
            }
        }
    }
}
