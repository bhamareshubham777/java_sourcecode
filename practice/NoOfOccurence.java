package practice;

import java.util.HashSet;

public class NoOfOccurence {
	public static void main(String[] args) {
		HashSet<Character>hs1=new HashSet<>();
		
		String str="rabbit and tortoise technology solutions";
		for(int i=0 ; i<str.length() ; i++) {
			hs1.add(str.charAt(i));
		}
		
		for(char ch:hs1) {
			int count=0;
			for(int i=0 ; i<str.length() ; i++) {
				if(ch==str.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch+" : "+count);
		}
	}
}
