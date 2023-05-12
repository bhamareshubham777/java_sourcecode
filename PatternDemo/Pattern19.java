package PatternDemo;

public class Pattern19 {
    public static void main(String[] args) {
        int line=5;
        int space=line-1;
        int star =1;
        for (int i=0 ; i<line ; i++){
            int no=1;
            for (int k=0 ; k<space ; k++){
                System.out.print(" ");
            }
            space--;
            for (int j=0 ; j<star ; j++){
                System.out.print(no);
                no++;

            }
            System.out.println();
            star++;
        }
    }
}
