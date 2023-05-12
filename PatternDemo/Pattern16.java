package PatternDemo;

public class Pattern16 {
    public static void main(String[] args) {
        int row=5;
        int col=5;

        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                if(i+j==2 || i+j==6 ){
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
