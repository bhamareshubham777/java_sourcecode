package StringDemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("ENTER STRING");
        String str = sc1.nextLine();

        String newStr = str.toUpperCase();
        char []data = newStr.toCharArray();
        int icntC=0;
        int icntV=0;
        for (int a=0 ; a< data.length ; a++){
            if(data[a]=='A' || data[a]=='E' || data[a]=='I' || data[a]=='O' || data[a]=='U'){
                icntV++;
            }else{
                icntC++;
            }
        }
        System.out.println(icntV+" No of vowels are present");
        System.out.println(icntC+" No of consonent are present");
    }
}
