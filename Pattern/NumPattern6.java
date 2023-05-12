package Pattern;

public class NumPattern6 {
    public static void main(String[] args) {
        int row=4,col=2;
        int ch1=1;

        for (int i=0 ; i<row ; i++){
            int ch2=ch1;
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+ch2);
                ch2*=2;
            }
            System.out.println();
            col++;
            ch1++;
        }
    }
}
