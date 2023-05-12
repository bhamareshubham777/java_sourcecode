package PatternDemo;

public class Pattern15 {
    public static void main(String[] args) {
        int row=5;
        int col=5;

        for (int i=1 ; i<=row ; i++){
            for (int j=1 ; j<=col ; j++){
                if(j%2!=0&&i%2!=0 || j%2==0 && i%2==0){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
