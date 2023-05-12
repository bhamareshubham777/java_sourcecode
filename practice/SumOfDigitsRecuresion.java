package practice;

import java.util.Scanner;

public class SumOfDigitsRecuresion {
	static int sum=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER: ");
		int num=sc.nextInt();
		System.out.println("ADDITION OF DIGITS IS: "+summation(num));
	}

	public static int summation(int num) {
		if(num==0) {
			return 0;
		}else {
			int digit=num%10;
			sum+=digit;
			num/=10;
			summation(num);
			return sum;
		}
	}
}
