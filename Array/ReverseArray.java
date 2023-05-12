package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr=RandomArray.randomArr(6);

        for (int b : arr) {
            System.out.print(" "+b);
        }
        System.out.println();
        int count=arr.length-1;
        for (int i=0 ; i<arr.length/2 ; i++){
            int temp=arr[i];
            arr[i]=arr[count];
            arr[count]=temp;
            count--;
        }

        for (int a : arr) {
            System.out.print(" "+a);
        }
    }
}
