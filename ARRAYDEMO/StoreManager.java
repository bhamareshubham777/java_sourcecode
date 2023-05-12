package ARRAYDEMO;

public class StoreManager {
    String []products = {"TV","PROJECTOR","MOBILE"};
    double []cost = {15000.25,20000.50,25000.75};
    int []stock = {15,25,35};

    void calculateBill(int choice,int qty){
        boolean found = false;

        for(int a=0; a<cost.length;a++){
            if(choice == a && qty <= stock[a]){
                double billAmt = qty * cost[a];
                stock[a] -= qty;
                System.out.println("BILL AMOUNT: "+billAmt);
                found = true;
            }
        }
        if(!found){
            System.out.println("PRODUCT NOT FOUND OR STOCK UNAVAILABLE");
        }
    }
}
