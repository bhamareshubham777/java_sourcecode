package LOOPINGSTMNT;

import java.util.Scanner;

public class WhileLoopDemo3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        boolean status=true;

        while(status)
        {
            System.out.println("1:ADDITION\n2:SUBSTRACTION\n3:EXIT");
            int choice = sc1.nextInt();

            System.out.println("ENTER FIRST NO");
            int no1 = sc1.nextInt();
            System.out.println("ENTER SECOND NO");
            int no2 = sc1.nextInt();

            if(choice==1)
            {
                System.out.println("ADDITION IS: "+(no1+no2));
            }
            else if (choice==2)
            {
                System.out.println("SUBSTRACTION IS: "+(no1-no2));
            }
            else
            {
                status=false;
            }
        }
    }
}
