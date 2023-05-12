package PatternDemo;

public class NumPattern6 {
    public static void main(String[] args) {
        int row=4;
        int col=4;
        char ch='A';
        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                System.out.print(" "+ch++);
                if(ch>'E'){
                    ch='A';
                }
            }
            System.out.println();
        }
    }
}
