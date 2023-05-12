package Array;

public class MergeArray1 {
    public static void main(String[] args) {
        int []arr1={11,22,33};
        int []arr2={44,55,66};
        int l1=arr1.length+arr2.length;
        int result[]=new int[l1];
        int count=0;

        for (int a : arr1) {
            result[count++]=a;
        }
        for (int b : arr2) {
            result[count++]=b;
        }
        for (int c : result) {
            System.out.print(" "+c);
        }
    }
}
