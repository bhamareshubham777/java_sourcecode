package Array;

public class MissingNumber {
    public static void main(String[] args) {
        int []arr={11,13,14,15};

        int n= arr.length;

        int sum=((n+1)*(n+2)/2);

        for (int a : arr){
            sum-=a;
        }
        System.out.println(sum);
    }
}
