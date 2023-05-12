package Pattern;

public class StarPattern12 {
    public static void main(String[] args) {
        int row=9,col=5,space=0;

        for (int i=0 ; i<row ; i++){
            for (int k=0 ; k<space ; k++){
                System.out.print(" ");
            }
            for (int j=0 ; j<col ; j++){
                System.out.print("*");
            }
            System.out.println();
            if (i<4){
                space++;
                col--;
            }else {
                space=4;
                col++;
            }
        }
    }
}
