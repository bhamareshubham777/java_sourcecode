package practice;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		for(int i=1 ; i<=10000 ; i++) {
			int num=i;
			
			int exponent=0;
			int tempNum=num;
			while(tempNum != 0) {
				exponent++;
				tempNum/=10;
			}
			
			tempNum=num;
			int sum=0;
			while(tempNum != 0) {
				int pow = 1;
				int iDigit=tempNum%10;
				for(int a=0 ; a<exponent ; a++ ) {
					pow=pow*iDigit;
				}
				sum+=pow;
				tempNum/=10;
				if (num==sum) {
					System.out.println(num+" ");
				}
			}
		}
		
	}
}
