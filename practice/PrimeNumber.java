package practice;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		for(int i=1 ; i<=100 ; i++) {
		int num=i;
		int count=0;
		for(int a=1 ; a<=num ; a++) {
			if (num%a==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.print(num+" ");
		}
		}
	}
}
