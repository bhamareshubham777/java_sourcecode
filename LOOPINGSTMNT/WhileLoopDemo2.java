package LOOPINGSTMNT;

import java.util.Scanner;

public class WhileLoopDemo2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int no = 0,sum = 0;

        while(sum<=50)
        {
            System.out.println("Enter Number");
            no = sc1.nextInt();
            sum += no;
        }
        System.out.println(sum);
    }
}
