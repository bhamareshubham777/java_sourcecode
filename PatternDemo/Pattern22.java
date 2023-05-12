package PatternDemo;

public class Pattern22 {
    public static void main(String[] args) {
        int lines=9;
        int space=4;
        int col=1;

        for (int i=0 ; i<lines ; i++){
            char ch='A';
            for (int k=0 ; k<space ; k++){
                System.out.print(" ");
            }
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+ch++);
            }
            System.out.println();
           if (i<=3) {
               col++;
               space--;
           }else{
               col--;
               space++;
           }
        }
    }
}
