package PatternDemo;

public class Pattern17 {
    public static void main(String[] args) {
        int row=5;
        int col=7;
        int space=4;

        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<space ; j++){
                System.out.print("  ");
            }
            for (int k=0 ; k<col ; k++){
                System.out.print(" *");
            }
            System.out.println();
            space--;
        }
    }
}
