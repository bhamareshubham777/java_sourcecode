package PatternDemo;

public class NumPattern10 {
    public static void main(String[] args) {
        int row=5;
        int col=4;

        for (int i=0 ; i<row ; i++){
            int ch1=1;
            char ch2='A';
            for (int j=0 ; j<col ; j++){
                if(i%2==0){
                    System.out.print(" "+ch1++);
                }
                else{
                    System.out.print(" "+ch2++);
                }
            }
            System.out.println();
        }
    }
}
