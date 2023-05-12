package ExceptinHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("PROGRAM STARTED");
        Scanner sc1 = new Scanner(System.in);
        try {
            System.out.println("ENTER 1 NO");
            int no1 = sc1.nextInt();
            System.out.println("ENTER 2 NO");
            int no2 = sc1.nextInt();
            int result = no1 / no2;
            System.out.println(result);
        }catch (ArithmeticException a){
            System.out.println(a);
        }catch (InputMismatchException b){
            System.out.println(b);
        }
        System.out.println("PROGRAM ENDED");
    }
}
