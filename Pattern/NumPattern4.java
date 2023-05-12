package Pattern;

public class NumPattern4 {
    public static void main(String[] args) {
        int row = 5, col = 5;
        int ch = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    System.out.print(ch++);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}