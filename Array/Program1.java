package Array;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        int []arr=RandomArray.randomArr(10);

        for (int a : arr){
            System.out.print(" "+a);
        }

        int no=new Scanner(System.in).nextInt();

        for (int i=0 ; i< arr.length ; i++){
            if (arr[i]==no){
                System.out.println("Index: " +i);
            }
        }
    }
}
