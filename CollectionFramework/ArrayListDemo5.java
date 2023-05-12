package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Character>data=new ArrayList<>();
        data.add('S');
        data.add('P');
        data.add('K');

        Iterator<Character>itr= data.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        ListIterator<Character>itr1= data.listIterator();
        while (itr1.hasPrevious()){
            System.out.println(itr1.previous());
        }
    }
}
