package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> data=new ArrayList<>();
        data.add(35);
        data.add(45);
        data.add(55);
        System.out.println(data);
        Iterator<Integer> itr= data.iterator();
        while (itr.hasNext()){
            if (itr.next()==45){//fetch data
                itr.remove();//remove data
            }
        }
        System.out.println(data);
    }
}
