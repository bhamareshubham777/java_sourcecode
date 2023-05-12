package PatternDemo;

public class NumPattern1 {
    public static void main(String[] args) {
        int row=5;
        int col=5;
        int ch=1;
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+ch);
            }
            ch++;
            System.out.println();
        }
    }
}
