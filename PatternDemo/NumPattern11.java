package PatternDemo;

public class NumPattern11 {
    public static void main(String[] args) {
        int row=5;
        int col=6;

        for (int i=0 ; i<row ; i++){
            int ch=1;
            for (int j=0 ; j<col ; j++){
                if(j%2==0){
                    System.out.print(" "+ch++);
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.println();

        }
    }
}
