package Array;

public class MaxInArray {
    public static void main(String[] args) {
        int []arr = {11,21,51,101,31};
        int max=arr[0];

        for (int a : arr) {
            if (max<a){
                max=a;
            }
        }
        System.out.println(max);
    }
}
