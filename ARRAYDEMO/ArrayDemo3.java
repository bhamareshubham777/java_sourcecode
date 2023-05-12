package ARRAYDEMO;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("ENTER NO OF COURSES:");
        int size = sc1.nextInt();

        String []courses = new String[size];

        System.out.println("ENTER COURSES:");
        for(int a=0; a<size;a++){
            courses[a]=sc1.next();
        }

        System.out.println("COURSES ARE:");
        for(int a=0; a<size;a++){
            System.out.println(courses[a]);
        }
    }
}
