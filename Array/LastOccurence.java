package Array;

import java.util.Scanner;

public class LastOccurence {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);

        int []data={11,21,31,21,51};
        int l1= data.length;

        System.out.println("ENTER NUM TO SEARCH");
        int no=sc1.nextInt();

        int i;
        for (i=l1-1 ; i>=0 ; i--){
           if(data[i]==no){
               break;
            }
        }
        if (i<0){
            System.out.println("THERE IS NO SUCH A NUMBER");
        }else {
            System.out.println(i);
        }
    }
}
