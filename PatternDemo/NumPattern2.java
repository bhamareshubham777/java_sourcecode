package PatternDemo;

public class NumPattern2 {
    public static void main(String[] args) {
        int row=5;
        int col=5;

        for (int i=0 ; i<row ; i++){
            int ch=1;
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+ch++);
            }
            System.out.println();
        }
    }
}
