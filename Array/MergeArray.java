package Array;

public class MergeArray {
    public static void main(String[] args) {
        int []arr1={10,20,30};
        int []arr2={40,50,60};
        int l1=arr1.length;
        int l2=arr2.length;
        int []arr3=new int [l1+l2];
        int count=0;

        for (int a : arr1){
            arr3[count++]=a;
        }
        for (int b : arr2){
            arr3[count++]=b;
        }
        for (int c : arr3){
            System.out.println(c+" ");
        }
    }
}
