package Pattern;

public class StarPattern16 {
    public static void main(String[] args) {
        int row=5,col=5;

        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                if (j==0 || i==j || i==4){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
