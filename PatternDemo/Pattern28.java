package PatternDemo;

public class Pattern28 {
    public static void main(String[] args) {
        int row=5,col=9;

        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                if (i==4 || i+j==4 || j-i==4) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
