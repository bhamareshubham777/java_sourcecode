package Test;

public class TestProgram5 {
    public static void main(String[] args) {
        int row=5;
        int col=1;
        int ch=1;
        int space=row-1;

        for (int i=0 ; i<row ; i++){
            for (int k=0 ; k<space ; k++){
                System.out.print(" ");
            }
            for (int j=0 ; j<col ; j++){
                System.out.print(ch+++" ");
                if (ch>6){
                    ch=1;
                }
            }
            System.out.println();
            col++;
            space--;
        }
    }
}
