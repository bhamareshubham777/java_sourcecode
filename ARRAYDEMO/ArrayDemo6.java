package ARRAYDEMO;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int []arr1 = {35,45,55};
        int []arr2 = {45,55,65};
        int []sum = new int[arr1.length];
        int a;
        for(a=0; a<arr1.length; a++){
            sum[a] = arr1[a] + arr2[a];
            System.out.println(sum[a]);
        }
    }
}
