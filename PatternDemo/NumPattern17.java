package PatternDemo;

public class NumPattern17 {
    public static void main(String[] args) {
        int row=4;
        int col=1;
        int ch=1;
        int space=3;

        for (int i=0 ; i<row ; i++){
            for (int k=0 ; k<space ; k++){
                System.out.print(" ");
            }
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+ch++);
            }
            System.out.println();
            col++;
            space--;
        }
    }
}
