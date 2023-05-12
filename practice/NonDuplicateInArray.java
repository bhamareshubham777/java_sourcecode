package practice;

public class NonDuplicateInArray {
	public static void main(String[] args) {
		int []arr= {1,1,1,2,3,4,5,8,5,6,3,5,6};
		
		for(int a : arr) {
			int count=0;
			for(int b : arr) {
				if(a==b) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(a+" ");
			}
		}
	}
}
