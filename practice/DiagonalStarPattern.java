package practice;

import java.util.Scanner;

public class DiagonalStarPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ROWS: ");
		int rows=sc.nextInt();
		System.out.println("ENTER COLUMNS: ");
		int cols=sc.nextInt();
		
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<cols ; j++) {
				if(i==j) {
					System.out.print(" * ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
