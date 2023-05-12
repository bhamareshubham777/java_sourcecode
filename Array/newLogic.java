package Array;

import java.util.ArrayList;

public class newLogic {
    public static void main(String[] args) {
        int arr1[] = {6, 6, 8, 2, 4, 0, 3, 6, 5, 1};
        ArrayList<Integer> data1 = new ArrayList<Integer>();
        int space = 0;
        for (int j = 0; j <= arr1.length; j++) {
            ArrayList<Integer> data2 = new ArrayList<Integer>();
            for (int i = 0; i < space; i++) {
                data2.add(arr1[i]);
            }
            if (!(data2.contains(0))) {
                data1.add(0);
            } else if (data2.contains(0) && data2.contains(1)) {
                data1.add(7);

            } else {
                data1.add(1);
            }

            space++;

        }
        for (int a : data1) {
            System.out.print(a + " ");
        }
    }
}
