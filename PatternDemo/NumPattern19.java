package PatternDemo;

public class NumPattern19 {
    public static void main(String[] args) {
        int row=4;
        int col=1;

        for (int i=0 ; i<row ; i++){
            int n1=0,n2=1,n3;
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+n1);
                n3=n1+n2;
                n1=n2;
                n2=n3;
            }
            System.out.println();
            col+=2;
        }
    }
}
