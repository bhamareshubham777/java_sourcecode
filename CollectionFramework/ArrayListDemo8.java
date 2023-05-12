package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo8 {
    public static void main(String[] args) {
        ArrayList<Double>data1=new ArrayList<>();
        ArrayList<Double>data2=new ArrayList<>();

        data1.add(22.35);
        data1.add(33.55);

        data2.add(11.25);
        data2.add(44.55);

        data1.addAll(data2);
        System.out.println(data1);
    }
}
