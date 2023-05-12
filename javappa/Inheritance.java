// Inheritance classes

import java.lang.*;

class Inheritance
{
	public static void main(String arg[])
	{
		Base bobj = new Base();
		bobj.fun();

		Derived dobj = new Derived();
		dobj.fun();
		dobj.gun();
	}
}
class Base
{
	public int iNo1,iNo2;

	public Base()
	{
		System.out.println("Inside Base Constructor");
		this.iNo1 = 0;
		this.iNo2 = 0;
	}
	public Base(int x, int y)
	{
		System.out.println("Inside base constructor");
		this.iNo1 = x;
		this.iNo2 = y;
	}
	public void fun()
	{
		System.out.println("Inside Base fun");
	}
}
class Derived extends Base
{
	int a,b;
	
	public Derived()
	{
		System.out.println("Inside Derived Constructor");
		this.a = 0;
		this.b = 0;
	}
	public Derived(int x1, int y1)
	{
		int a = x1;

		int b = y1;
	}
	public void gun()
	{
		System.out.println("Inside Derived gun");
	}
}
