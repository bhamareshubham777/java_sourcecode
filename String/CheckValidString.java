package String;

import java.util.Scanner;

public class CheckValidString {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("ENTER PASSWORD");
        String str = sc1.next();
        int l1 = str.length();
        int count = 0;
        System.out.println(l1);
        if (l1==10) {
            for (int i=0 ; i<l1 ; i++) {
                if (str.charAt(i) >= 'A' || str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' || str.charAt(i) <= 'z'|| str.charAt(i) >= 0 || str.charAt(i) <= 9) {
                    if (str.charAt(i) > 0 || str.charAt(i) < 9) {
                        count++;
                    }
                }else{
                    System.out.println("PASSWORD DOES NOT CONTAINS CHAR/DIGITS");
                }
            }
            if (count >= 2) {
                System.out.println("PASSWORD IS VALID");
            }
        }else{
            System.out.println("INVALID PASSWORD LENGTH");
        }
    }
}
