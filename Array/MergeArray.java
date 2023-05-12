package Array;

public class MergeArray {
    public static void main(String[] args) {
        int []arr1={1,2,3,4};
        int []arr2={5,6,7,8,9};
        int size=arr1.length+arr2.length;
        int []result=new int[size];
        int count=0;

        for (int a : arr1){
            result[count++]=a;
        }
        for (int b : arr2){
            result[count++]=b;
        }
        for (int c : result){
            System.out.print(" "+c);
        }
    }
}
