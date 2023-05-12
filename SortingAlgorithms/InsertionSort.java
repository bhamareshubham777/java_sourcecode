package SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr={9,7,6,15,17,5,10,11};

        for (int i=1 ; i<arr.length ; i++){
            int key=arr[i];
            int j=i-1;

            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for (int a : arr){
            System.out.print(" "+a);
        }
    }
}
