package PatternDemo;

public class Pattern23 {
    public static void main(String[] args) {
        int row=9;
        int col=5;

        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                if (i%2!=0 || j==2 ){
                    System.out.print(" # ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
