package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAsc2 {
    public static void main(String[] args) {
        int []arr={25,55,15,45,35};
        ArrayList<Integer>data=new ArrayList<>();
        for (int a : arr){
            data.add(a);
        }
        System.out.println(data);

        Collections.sort(data,Collections.reverseOrder());
        System.out.println(data);
    }
}
