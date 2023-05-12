package Array;

public class MainApp {
    public static void main(String[] args) {
        Hospital h1;
        h1=new Forties();
        System.out.println(h1.getNoOfPatient());
        h1=new Narayana();
        System.out.println(h1.getNoOfPatient());
        h1=new Apollo();
        System.out.println(h1.getNoOfPatient());
    }
}
