package Pattern;

public class Numpattern5 {
    public static void main(String[] args) {
        int row=5,col=2;
        int ch=1;

        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                if (i%2==0){
                    System.out.print("* ");
                }else {
                    System.out.print(ch+" ");
                }
            }
            System.out.println();
            col++;
            if (i%2!=0){
                ch++;
            }
        }
    }
}
