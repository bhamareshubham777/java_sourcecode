package practice;

import java.util.Scanner;

public class PallindromeNumber {
	public static void main(String[] args) {
		for(int i=1 ; i<=200 ; i++) {
			int num = i;
			int temp=num;
			int revNum=0;
			while (temp!=0) {
				int iDigit=temp%10;
				revNum=(revNum*10)+iDigit;
				temp=temp/10;
			}
			if(revNum==num) {
				System.out.print(num+" ");
			}
		}
	}
}
