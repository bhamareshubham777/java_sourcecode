package Test;

import java.util.Scanner;

public class TestProgram1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        int []arr={11,21,51,101,111};
        System.out.println("ENTER NUMBER");
        int num = sc1.nextInt();


        for (int a=0 ; a<arr.length ; a++){
            if(arr[a]==num){
                System.out.println(a);
            }
        }
    }
}
