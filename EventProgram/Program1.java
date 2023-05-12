package EventProgram;

public class Program1 {
    public static void main(String[] args) {
        int row=9,col=5,space=0;

        for (int i=0 ; i<row ; i++){
         for (int j=0 ; j<col ; j++){
             System.out.print("*");
         }
         for (int k=0 ; k<space ; k++){
             System.out.print(" ");
         }
         for (int j=0 ; j<col ; j++){
             System.out.print("*");
         }
            System.out.println();
         if (i<4){
             col--;
             space+=2;
         }else{
             col++;
             space-=2;
         }
        }
    }
}
