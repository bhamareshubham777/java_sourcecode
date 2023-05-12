package StringDemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("ENTER NAME");
        String name = sc1.nextLine();
       String user = name.trim();

        if(!(name.isEmpty())){
            System.out.println("ENTER EMAIL");
            String email = sc1.next();
            if(email.contains("@") && email.contains(".")){
                System.out.println("ENTER PASSWORD");
                String pass = sc1.next();
                if(!(pass.contains(user)) && pass.length()>=8){
                    System.out.println("CONFIRM PASSWORD");
                    String confirmPass = sc1.next();
                    if(confirmPass.equals(pass)){
                        System.out.println("WELCOME "+user.toUpperCase());
                    }else{
                        System.out.println("PASSWORD DOES NOT MATCHED");
                    }
                }else{
                    System.out.println("INVALID PASSWORD");
                }
            }else{
                System.out.println("INVALID EMAIL");
            }
        }else{
            System.out.println("INVALID USERNAME");
        }
    }
}
