package COMPOSITION;

public class Shop {
    Salesman s1 = new Salesman();

    void purchaseProduct(){
        s1.provideService();
    }
}
