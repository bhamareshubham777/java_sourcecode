package ARRAYDEMO;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayDemo14 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("ENTER TOTAL NO OF FLOORS:");
        int floors = sc1.nextInt();

        System.out.println("ENTER TOTAL NO OF FLATS ON EACH FLOOR:");
        int flats = sc1.nextInt();

        int [][]building = new int[floors][flats];

        System.out.println("ENTER "+(floors*flats)+" FLAT NUMBERS:");
        for(int a=0; a<floors; a++){
            for(int b=0; b<flats; b++){
                building[a][b] = sc1.nextInt();
            }
        }

        for(int a=0; a<floors; a++){
            System.out.println("==============================");
            System.out.println("FLOOR NO: "+(a+1));
            System.out.println("------------------------------");
            for(int b=0; b<flats; b++){
                System.out.println("FLAT NO: "+building[a][b]);
            }
        }
    }
}
