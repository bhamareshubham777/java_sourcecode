package Pattern;

public class NumPattern7 {
    public static void main(String[] args){
        int row=5,col=4,col1=1;

        for (int i=0 ; i<row ; i++){
            int ch=1;
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+0);
            }
            for (int j=0 ; j<col1 ; j++){
                System.out.print(" "+ch++);
            }
            System.out.println();
            col--;
            col1++;
        }
    }
}
