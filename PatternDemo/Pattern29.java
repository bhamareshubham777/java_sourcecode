package PatternDemo;

public class Pattern29 {
    public static void main(String[] args) {
        int row=5,col=9;

        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                if (i==j || i==0 || i+j==8){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
