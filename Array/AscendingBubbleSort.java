package Array;

public class AscendingBubbleSort {
    public static void main(String[] args) {
        int []arr={11,51,21,111,101};

        for (int i=0 ; i< arr.length ; i++){
            for (int j=i+1 ; j< arr.length ; j++){
                if (arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int a : arr){
            System.out.println(a);
        }
    }
}
