package PatternDemo;

public class Pattern30 {
    public static void main(String[] args) {
        int row=9,col=9;

        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                if (i+j==4 || j-i==4 || i-j==4 || i+j==12){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
