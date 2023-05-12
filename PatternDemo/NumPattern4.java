package PatternDemo;

public class NumPattern4 {
    public static void main(String[] args) {
        int row=4;
        int col=4;
        int ch1=1;
        for (int i=0 ; i<row ; i++){
            int ch2 =1;
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+ch1*ch2);
                ch2++;
            }
            ch1++;
            System.out.println();
        }
    }
}
