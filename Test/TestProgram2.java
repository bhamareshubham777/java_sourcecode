package Test;

public class TestProgram2 {
    public static void main(String[] args) {
        int row=6;
        int col=1;
        int space=0;

        for (int i=0 ; i<row ; i++){
            for (int k=0 ; k<space ; k++){
                System.out.print(" ");
            }
            for (int j=0 ; j<col ; j++){
                System.out.print("*");
            }
            System.out.println();
            col++;
            space++;
        }
    }
}
