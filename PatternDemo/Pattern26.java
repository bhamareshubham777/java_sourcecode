package PatternDemo;

public class Pattern26 {
    public static void main(String[] args) {
        int row=7;
        int col=1;
        int space=row-1;

        for (int i=0 ; i<row ; i++){
            for (int k=0 ; k<space ; k++){
                System.out.print("   ");
            }
            for (int j=0 ; j<col ; j++){
                System.out.print(" * ");
            }
            System.out.println();
            col+=2;
            space--;
        }
    }
}
