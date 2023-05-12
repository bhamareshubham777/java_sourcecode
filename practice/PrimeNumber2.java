package practice;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUM");
		int num=sc.nextInt();
		int c=1;
		
		for(int i=1 ; c<=num ; i++) {
			int count=0;
			for(int j=1 ; j<=i ; j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				c++;
				System.out.print(i+" ");
			}
		}
	}
}
