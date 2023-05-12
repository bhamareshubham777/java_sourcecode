package PatternDemo;

public class Pattern25 {
    public static void main(String[] args) {
        int row=5;
        int col=1;
        int space=2;

        for (int i=0 ; i<row ; i++){
            for (int k=0 ; k<space ; k++){
                System.out.print(" ");
            }
            for (int j=0 ; j<col ; j++){
                System.out.print(" *");
            }
            System.out.println();
            if (i<2){
                space--;
                col++;
            }else {
                space++;
                col--;
            }
        }
    }
}
