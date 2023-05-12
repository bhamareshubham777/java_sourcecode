package Array;

public class SumOfArray {
    public static void main(String[] args) {
        int []arr1={10,20,30,40,50};
        int []arr2={10,20,30,40,50};
        int l1= arr1.length;
        int []result=new int[l1];

        for (int i=0 ; i<l1 ; i++){
            result[i]=arr1[i]+arr2[i];
        }
        for (int c : result) {
            System.out.print(" "+c);
        }
    }
}
