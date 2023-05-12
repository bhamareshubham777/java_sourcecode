package PatternDemo;

public class Pattern24 {
    public static void main(String[] args) {
        int row=4;
        int col=1;

        for (int i=0 ; i<row ; i++){
            int c=2;
            int ch = 9;
            for (int j=0 ; j<col ; j++){
                System.out.print(ch+" ");
                ch=ch-c;
                c++;

            }
            System.out.println();
            col++;

        }
    }
}
