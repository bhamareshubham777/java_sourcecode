package Array;

public class SecondMax2 {
    public static void main(String[] args) {
        int arr[]={11,21,31,51,101,111};
        int max1=arr[0];
        int max2=arr[1];
        for (int a : arr) {
            if (a>max1){
                max2=max1;
                max1=a;
            }else if (a>max2){
                max2=a;
            }
        }
        System.out.println(max2);
    }
}
