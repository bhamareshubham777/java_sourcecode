package SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={9,7,6,17,15,5,11,21};

        for (int i=0 ; i<arr.length-1 ; i++){
            int minIdx=i;
            for (int j=i+1 ; j<arr.length ; j++){
                if (arr[minIdx] < arr[j]){
                    minIdx=j;

                }

            }
            int temp=arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;
        }
        for (int a : arr){
            System.out.print(a+" ");
        }
    }
}
