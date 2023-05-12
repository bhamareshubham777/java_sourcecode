package Array;

import java.util.Scanner;

public class RemoveIndexElement {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("ENTER INDEX VALUE :");
        int index = sc1.nextInt();

        int []arr = {11,21,51,101,111};

        int[]result = removeElement(arr,index);
        for (int a : result){
            System.out.print(a+" ");
        }
    }

    static int [] removeElement(int[]arr,int index){
        int[]temp = new int[arr.length-1];
        int j=0;
        if(index<0 || index>arr.length){
            System.out.println("INVALID INDEX");
            return arr;
        }
//        for (int i=0 ; i<arr.length ; i++){
//            if (i==index){
//                continue;
//            }else{
//                temp[j++]=arr[i];
//            }
//        }

//
        for (int i=0 ; i<arr.length ; i++){
            if (i!=index){
                temp[j++]=arr[i];
            }
        }
        return temp;
    }
}

