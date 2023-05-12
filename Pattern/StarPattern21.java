package Pattern;

public class StarPattern21 {
    public static void main(String[] args) {
        int row=9;
        int col1=5,col2=5,space=0;

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
            if (i<4){
                col1--;
                col2--;
                space+=2;
            }else{
                col1++;
                col2++;
                space-=2;
            }
        }
    }
}
