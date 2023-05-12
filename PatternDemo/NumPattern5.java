package PatternDemo;

public class NumPattern5 {
    public static void main(String[] args) {
        int row=4;
        int col=5;
        int ch=1;
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+ch++);
                if(ch>7){
                    ch=1;
                }
            }
            System.out.println();
        }
    }
}
