package practice;

import java.util.Scanner;

public class PallindromeString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER STRING");
		String str=sc.next();
		
		String revStr="";
		
		for(int i=str.length()-1 ; i>=0 ; i--) {
			revStr=revStr+str.charAt(i);
		}
		
		if(revStr.equals(str)) {
			System.out.println("STRING IS PALINDROME");
		}else {
			System.out.println("STRING IS NOT PALINDROME");
		}
	}
}
