package EventProgram;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("ENTER NUMBER");
        int no = sc1.nextInt();

        int num=no;
        int count1=0,count2=0,i=0;

        while (no != 0){
            count1++;
            no/=2;
        }
        int []arr=new int[count1];

        while(num != 0){
            arr[i++]=num%2;
                    num/=2;
        }

        for (int j= arr.length-1 ; j>=0 ; j--){
            System.out.print(arr[j]+" ");

            if (arr[j]==0){
                count2++;
            }
        }
        System.out.println();
        System.out.println("NO. OF 0's ARE: "+count2);
    }
}
