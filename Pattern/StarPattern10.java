package Pattern;

public class StarPattern10 {
    public static void main(String[] args) {
        int row=9,col=5;
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                System.out.print("*");
            }
            System.out.println();
            if (i<4){
                col--;
            }else {
                col++;
            }
        }
    }
}
