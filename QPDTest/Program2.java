package QPDTest;

import ExceptinHandling.InvalidEmailException;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER EMAIL:");
        String email=sc.next();
        validation(email);
    }
    static void validation(String email){
        if (email.contains("@") && email.contains(".")){
            System.out.println("VALIDATION SUCCESSFUL");
        }else{
            throw new InvalidEmailException("INVALID EMAIL");
        }
    }
}
