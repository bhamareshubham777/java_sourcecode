package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListAsc {
    public static void main(String[] args) {
        ArrayList<Integer>data=new ArrayList<>();
        data.add(25);
        data.add(35);
        data.add(45);
        data.add(15);
        data.add(55);

        Iterator<Integer>itr= data.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Collections.sort(data);
        System.out.println(data);

        Collections.sort(data,Collections.reverseOrder());
        System.out.println(data);
    }
}
