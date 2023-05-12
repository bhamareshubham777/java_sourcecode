package practice;

import java.util.Iterator;
import java.util.Scanner;

public class NthElementInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {11,21,31,41,51,61,101};
		System.out.println("ENTER POSITION");
		int idx=sc.nextInt();
		
		for(int i=0 ; i<arr.length; i++) {
			if(idx<0 || idx>arr.length) {
				System.out.println("INVALID INDEX");
				break;
			}else if(idx==i) {
				System.out.println(arr[i-1]);
			}
		}
	}
}
