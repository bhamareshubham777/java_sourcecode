package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<Integer>data=new ArrayList<>();
        data.add(36);
        data.add(98);
        data.add(45);
        data.add(1,78);
        data.add(63);
        data.remove(2);
        data.add(47);
        data.add(3,23);
        data.set(4,55);
        data.remove(1);

        System.out.println(data.get(3));
        System.out.println(data);
    }
}
