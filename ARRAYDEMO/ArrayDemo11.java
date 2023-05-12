package ARRAYDEMO;

import java.util.Scanner;

public class ArrayDemo11 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        BillCalculator b1 = new BillCalculator();

        System.out.println("ENTER TOTAL NO OF BILLS");
        int count = sc1.nextInt();

        double []amounts = new double[count];

        System.out.println("ENTER BILL AMOUNT");
        for(int a=0; a<amounts.length; a++){
            amounts[a] = sc1.nextDouble();
        }

        b1.calculateBill(amounts);
    }
}
