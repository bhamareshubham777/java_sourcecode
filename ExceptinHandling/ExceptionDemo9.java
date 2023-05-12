package ExceptinHandling;

import java.util.Scanner;
import java.util.SortedMap;

public class ExceptionDemo9 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("ENTER QTY");
        int qty=sc1.nextInt();
        System.out.println("ENTER PRICE");
        double price = sc1.nextDouble();

        billCalculation(qty,price);
    }
    static void billCalculation(int qty,double price){
        if (qty>0 && price>0){
            double total=qty*price;
            System.out.println(total);
        }else {
            throw new IllegalArgumentException("Arguments are not valid");
        }
    }
}
