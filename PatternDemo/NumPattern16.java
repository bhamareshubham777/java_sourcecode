package PatternDemo;

public class NumPattern16 {
    public static void main(String[] args) {
        int row=5;
        int col=1;
        int ch1=1,ch2=1;

        for (int i=0 ; i<row ; i++){
            ch1=ch2;
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+ch1--);
            }
            System.out.println();
            ch2++;
            col++;
        }
    }
}
