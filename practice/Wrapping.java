package practice;

public class Wrapping {
	public static void main(String[] args) {
		int a=11;
		Integer ob1=new Integer(a);//auto-boxing
		System.out.println(ob1);
		
		int i=ob1;//auto-unboxing
		System.out.println(i);
		
		Integer ob2=Integer.valueOf(a);//auto-boxing
		System.out.println(ob2);
		
		int j=ob2.intValue();//auto-unboxing
		System.out.println(j);
	}
}
