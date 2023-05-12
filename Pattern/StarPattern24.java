package Pattern;

public class StarPattern24 {
    public static void main(String[] args) {
        int row = 9, col1=1, space=8;
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col1 ; j++){
                System.out.print("*");
            }
            for (int k=0 ; k<space ; k++){
                System.out.print(" ");
            }
            for (int j=0 ; j<col1 ; j++){
                System.out.print("*");
            }
            if (i<4){
                col1++;
                space-=2;
            }else{
                col1--;
                space+=2;
            }
            System.out.println();
        }
    }
}
