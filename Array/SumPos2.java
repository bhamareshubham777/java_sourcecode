package Array;

public class SumPos2 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,4,6,8};

        int l1=arr.length-1;

        for (int i=0; i<arr.length/2 ; i++){
            int num1=arr[i];
            int num2=arr[l1--];
            System.out.print(num1+num2 +" ");
        }
    }
}
