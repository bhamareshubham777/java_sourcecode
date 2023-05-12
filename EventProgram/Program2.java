package EventProgram;

public class Program2 {
    public static void main(String[] args) {
        int row=5,col=1,space=row-1;
        int ch1=0;

        for (int i=0 ; i<row ; i++){
            int ch2=ch1;
            for (int k=0 ; k<space ; k++){
                System.out.print("  ");
            }
            for (int j=0 ; j<col ; j++){
                if (j>3) {
                    System.out.print(ch2++ + " ");
                }else {
                    System.out.print(ch2-- +" ");
                }
                if (ch2<0){
                    ch2=1;
                }
            }
            System.out.println();
            ch1++;
            col+=2;
            space--;
        }
    }
}
