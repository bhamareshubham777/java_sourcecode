package PatternDemo;

public class Pattern18 {
    public static void main(String[] args) {
        int row=5;
        int star=1;
        int space=row-1;

        for (int i=0 ; i<row ; i++) {
            for (int a = 0; a < space; a++) {
                System.out.print(" ");

            }
            space--;
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star++;
        }
    }
}
