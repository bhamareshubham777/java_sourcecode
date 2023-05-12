package ARRAYDEMO;

import java.util.Scanner;

public class ArrayDemo8 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        StoreManager m1 = new StoreManager();

        boolean status = true;

        while(status){
            System.out.println("SELECT PRODUCT: ");
            System.out.println("0:TV\n1:PROJECTOR\n2:MOBILE");
            int choice = sc1.nextInt();

            System.out.println("ENTER QUANTITY:");
            int qty = sc1.nextInt();

            if(choice==0 || choice==1 || choice == 2){
                m1.calculateBill(choice,qty);
            }
            else{
                System.out.println("INVALID CHOICE");
                status=false;
            }
        }
    }
}
