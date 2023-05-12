package Pattern;

public class StarPattern22 {
    public static void main(String[] args) {
        int row=5;
        int col1=1,col2=1,space=8;

        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col1 ; j++){
                System.out.print("*");
            }
            for (int k=0 ; k<space ; k++){
                System.out.print(" ");
            }
            for (int j=0 ; j<col2 ; j++){
                System.out.print("*");
            }
            System.out.println();
            col1++;
            col2++;
            space-=2;
        }
    }
}
