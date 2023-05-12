package LOOPINGSTMNT;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("SELECT LANGUAGE:");
        System.out.println("1:JAVA\n2:PYTHON\n3:SQL");
        int choice = sc1.nextInt();

        switch(choice){
            case 1:
                System.out.println("SELECTED JAVA");
                break;
            case 2:
                System.out.println("SELECTED PYTHON");
                break;
            case 3:
                System.out.println("SELECTED SQL");
                break;
            default:
                System.out.println("INVALID CHOICE");
        }
    }
}
