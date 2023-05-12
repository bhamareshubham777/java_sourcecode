package SortingAlgorithms;

public class CharBubbleSort {
    public static void main(String[] args) {
        char []arr = {'D','E','B','C','A'};

        for (int i=0 ; i<arr.length ; i++){
            for (int j=0 ; j<arr.length-i-1 ; j++){
                if (arr[j] > arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (char a : arr){
            System.out.print(a+" ");
        }
    }
}
