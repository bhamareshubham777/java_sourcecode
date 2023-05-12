package PatternDemo;

public class NumPattern15 {
    public static void main(String[] args) {
        int row=7;
        int col=1;
        int ch1=7,ch2=7;
        int space=row-1;

        for (int i=0 ; i<row ; i++){
            ch1=ch2;
            for (int s=0 ; s<space ; s++){
                System.out.print(" ");
            }
            for (int j=0 ; j<col ; j++){
                System.out.print(ch1++ +" ");
            }
            ch2--;
            space--;
            col++;
            System.out.println();
        }
    }
}
