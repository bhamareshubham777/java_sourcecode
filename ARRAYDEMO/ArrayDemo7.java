package ARRAYDEMO;

import java.util.Scanner;

public class ArrayDemo7 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int []arr = {45,55,65};

        System.out.println("ENTER NO:");
        int no = sc1.nextInt();

        boolean flag = false;
        for(int a=0; a<arr.length; a++){
            if(arr[a] == no){
                flag = true;
            }
        }
        if(flag == true){
            System.out.println("No is Present");
        }
        else{
            System.out.println("No is not present");
        }
    }
}
