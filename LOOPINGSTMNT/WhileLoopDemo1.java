package LOOPINGSTMNT;

import java.util.Scanner;

public class WhileLoopDemo1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int no = 0;
        while(no>=0)
        {
            System.out.println("ENTER NUMBER:");
            no = sc1.nextInt();
            System.out.println(no);
        }
        System.out.println("NUMBER IS NEGATIVE");
    }
}
