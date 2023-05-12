package PatternDemo;

public class Pattern31 {
    public static void main(String[] args) {
        int row=9,col=5;

        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                if (j==0 || i==j || i+j==8){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
