package Array;

public class ArraySum {
    public static void main(String[] args) {
        int []arr={11,21,51,101,111};
        int result=addition(arr);
        System.out.println("SUM OF ARRAY ELEMENT IS : "+result);
    }

    static int addition(int []arr){
        int sum=0;
        for (int a : arr){
            sum+=a;
        }
        return sum;
    }
}
