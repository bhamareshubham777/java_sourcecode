package QPDTest;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Pragram1 {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(11);
        data.add(21);
        data.add(51);
        data.add(11);
        data.add(101);
        data.add(21);

        Set<Integer>s1=new LinkedHashSet<>(data);

        System.out.println(s1);
    }
}
