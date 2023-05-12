package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo10 {
    public static void main(String[] args) {
        Product p1 = new Product(11,"AC",2100.55);
        Product p2 = new Product(21,"TV",11000.25);
        Product p3 = new Product(51,"MOBILE",15000.75);

        ArrayList<Product>data=new ArrayList<>();
        data.add(p1);
        data.add(p2);
        data.add(p3);

        for (Product p : data){
            System.out.println(p);
        }
    }
}
