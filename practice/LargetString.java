package practice;

public class LargetString {
	public static void main(String[] args) {
		String str="I LOVE MY INDIA";
		String [] arr=str.split(" ");
		int l1=arr[0].length();
		
		for (int i = 0; i < arr.length; i++) {
			if(l1<arr[i].length()) {
				arr[0]=arr[i];
				break;
			}
		}
		System.out.println(arr[0]);
	}
}
