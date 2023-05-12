package Array;

public class StarArray {
    public static void main(String[] args) {
        char []arr={'S','T','A','R'};
        int row=4,col=4;

        for (int i=0 ; i<row ; i++){
            int ch2=i;
            for (int j=0 ; j<col ;j++){
                System.out.print(arr[ch2++]+" ");
                if (ch2>3){
                    ch2=0;
                }
            }
            System.out.println();

        }
    }
}
