package ExceptinHandling;

public class ExceptionDemo10 {

    static void test(){
        System.out.println("TEST STARTED");
        try {
            double c = 10 / 0;
        }catch(ArithmeticException e){

        }
        System.out.println("TEST ENDED");
    }

    static void display(){
        System.out.println("DISPLAY STARTED");
        test();
        System.out.println("DISPLAY ENDED");
    }

    static void info(){
        System.out.println("INFO STARTED");
        display();
        System.out.println("INFO ENDED");
    }

    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
            info();
        System.out.println("MAIN ENDED");
    }
}
