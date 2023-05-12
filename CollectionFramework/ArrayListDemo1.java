package CollectionFramework;

import java.util.ArrayList;

//Non-generic ArrayList
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList data = new ArrayList();
        data.add(30);
        data.add(35.5);
        data.add("Shubh");
        data.add('S');
        data.add(30);
        data.add(true);
        data.add(null);

        System.out.println(data);
    }
}
