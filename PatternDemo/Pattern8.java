package PatternDemo;

public class Pattern8 {
    public static void main(String[] args) {
        int rows=5;
        int cols=5;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i==0 || j==0 || i==4 || j==4){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" @ ");
                }
            }
            System.out.println();
        }
    }
}
