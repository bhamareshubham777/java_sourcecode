package ARRAYDEMO;

public class ArrayDemo9 {
    public static void main(String[] args) {
        int []arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        printArray(arr);
    }
    static void printArray(int []data){
        for(int a=0; a<data.length; a++){
            System.out.println(data[a]);
        }
    }
}
