package ARRAYDEMO;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("ENTER NO OF COURSES:");
        int count = sc1.nextInt();

        double marks[] = new double[count];
        double totalMarks = 0.0;
        System.out.println("ENTER MARKS:");
        for(int a=0; a<count; a++){
            marks[a]=sc1.nextDouble();
            totalMarks += marks[a];
        }
        System.out.println("TOTAL MARKS: "+totalMarks);
        System.out.println("PERCENTAGE: "+(totalMarks/count));
    }
}
