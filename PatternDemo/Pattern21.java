package PatternDemo;

public class Pattern21 {
    public static void main(String[] args) {
        int line=5;
        int space=line-1;
        int col =1;
        int no=1;
        for (int i=0 ; i<line ; i++){
            for (int k=0 ; k<space ; k++){
                System.out.print(" ");
            }
            space--;
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+no++);
                if (no>4){
                    no=1;
                }
            }
            System.out.println();
            col++;
        }
    }
}
