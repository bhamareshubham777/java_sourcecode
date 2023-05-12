package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("JAVA");
        data.add("J2EE");
        data.add("SQL");

        System.out.println(data);

        for (int a=0 ; a<data.size() ; a++){
            System.out.println(data.get(a));
        }

        for (String s : data){
            System.out.println(s);
        }
    }
}
