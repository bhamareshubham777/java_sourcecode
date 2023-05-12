package PatternDemo;

public class Pattern27 {
    public static void main(String[] args) {
        int row=9;
        int col1=5;
        int space=0;

        for (int i=0 ; i<row ; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < 4) {
                col1--;
            } else {
                col1++;
            }
        }
    }
}
