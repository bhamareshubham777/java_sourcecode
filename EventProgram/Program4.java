package EventProgram;

public class Program4 {
    public static void main(String[] args) {
        int []arr={3,2,1,6,5,4};
        int []result =new int[arr.length];
        int idx=0;

        for (int i= arr.length/2 ; i< arr.length ; i++){
            result[idx++]=arr[i];
        }
        for (int j=0 ; j< arr.length/2 ; j++){
            result[idx++]=arr[j];
        }

        for (int a : result){
            System.out.print(a+" ");
        }
    }
}
