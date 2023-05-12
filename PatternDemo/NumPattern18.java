package PatternDemo;

public class NumPattern18 {
    public static void main(String[] args) {
        int row=5;
        int col=1;
        int ch1=1;
        int ch2=4;

        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                System.out.print(ch1);
            }
            ch1++;
            col++;
            System.out.println();
        }
    }
}
