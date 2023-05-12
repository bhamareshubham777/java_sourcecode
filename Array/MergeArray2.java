package Array;

import java.util.Arrays;

public class MergeArray2 {
    public static void main(String[] args) {
        int []arr1={1,2,3,4};
        int []arr2={5,6,7,8};
        int size=arr1.length+arr2.length;
        int []result=new int[size];
        int count=0;

        for (int a : arr1){
            result[count]=a;
            count+=2;
        }

        count=1;
        for (int b : arr2){
            result[count]=b;
            count+=2;
        }
        System.out.println(Arrays.toString(result));
    }
}
