package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo9 {
    public static void main(String[] args) {
        ArrayList<Double>values=new ArrayList<>();
        values.add(10.5);
        values.add(5.10);
        values.add(20.45);
        values.add(45.15);
        values.add(45.20);
        values.add(25.25);
        System.out.println(values);
        Collections.sort(values);
        System.out.println(values);
        Collections.sort(values,Collections.reverseOrder());
        System.out.println(values);
    }
}
