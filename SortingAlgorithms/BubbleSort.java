package SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={51,11,31,21,41};

        int len= arr.length;
        for (int i=0 ; i<arr.length ; i++){
            for (int j=0 ; j<len-i-1 ; j++){
                if (arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            }
        for (int a : arr){
            System.out.print(" "+a);
        }
    }
}
