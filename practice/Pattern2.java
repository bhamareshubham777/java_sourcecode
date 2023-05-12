package practice;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ROWS");
		int rows=sc.nextInt();
		System.out.println("ENTER COLUMNS");
		int cols=sc.nextInt();
		
		for(int i=1 ; i<=rows ; i++) {
			for(int j=1 ; j<=i ; j++) {
				if(i%2==0) {
					System.out.print(" @");
				}else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
