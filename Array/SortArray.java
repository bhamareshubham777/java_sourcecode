package Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int []arr={11,21,51,31,111,101};

        Arrays.sort(arr);

        for (int a : arr){
            System.out.print(" "+a);
        }
    }
}
