package PatternDemo;

public class Pattern7 {
    public static void main(String[] args) {
        int lines = 10;
        int stars = 10;

        for(int i=0; i<lines; i++){
            for(int j=0; j<stars; j++){
                if(i==4 || j==4){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
