package PatternDemo;

public class NumPattern13 {
    public static void main(String[] args) {
        int row=6;
        int col=6;
        int ch1=1;
        int ch2=1;
        int space=0;

        for (int i=0 ; i<row ; i++){
            for (int s=0 ; s<space ; s++){
                System.out.print(" ");
            }
            space++;
            ch1=ch2;
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+ch1++);
            }
            System.out.println();
            ch2++;
            col--;
        }
    }
}
