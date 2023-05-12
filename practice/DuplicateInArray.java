package practice;

import java.util.HashSet;

public class DuplicateInArray {
	public static void main(String[] args) {
		HashSet<Integer>hs1=new HashSet<>();
		HashSet<Integer>hs2=new HashSet<>();
		int []arr= {1,1,1,2,3,4,5,8,5,6,3,5,6};
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i]==arr[j]) {
					hs1.add(arr[i]);
				}
			}
		}
		for(int no:hs1) {
			System.out.print(no+" ");
		}
	}
}
