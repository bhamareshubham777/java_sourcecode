package Test;

import java.util.Scanner;

public class TestProgram4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("ENTER STRING");
        String str = sc1.nextLine();

        String []data = str.split(" ");


        System.out.println("TOTAL NUMBER OF WORDS IN GIVEN STRING ARE: "+data.length);
    }
}
