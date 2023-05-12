package Array;

public class ArrayIteration2 {
    public static void main(String[] args) {
        int []arr={2,4,6,8,10,12,14,16,18,20};
        int sum=0;

        for (int a: arr) {
          sum+=a;
        }
        System.out.println("SUM: "+sum);
        System.out.println("AVERAGE: "+sum/arr.length);
    }
}
