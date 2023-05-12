package PatternDemo;

public class NumPattern14 {
    public static void main(String[] args) {
        int row=13;
        int col=7;
        int ch1=1,ch2=1;
        int space=0;

        for (int i=0 ; i<row ; i++){
            ch1=ch2;
            for (int s=0 ; s<space ; s++){
                System.out.print(" ");
            }
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+ch1++);
            }
            System.out.println();
            if(i<6) {
                space++;
                col--;
                ch2++;
            }else {
                space--;
                col++;
                ch2--;
            }
        }
    }
}
