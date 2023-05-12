package INHERITANCE;

public class MainApp3 {
    public static void main(String[] args) {
        ContractEmployee c1 = new ContractEmployee();
        c1.getInfo(101,4.5);
        c1.getContractDetails(24);

        PermenantEmployee p1 = new PermenantEmployee();
        p1.getInfo(201,8.5);
        p1.getDesignation("DEVELOPER");
    }
}
