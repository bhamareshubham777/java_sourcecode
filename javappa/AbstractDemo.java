class AbstractDemo
{
	public static void main(String arg[])
	{
		//Demo obj = new Demo();
		Demo obj;   // Allowed
		obj = new Hello();
		obj.fun();  // fun of Hello 
		obj.gun();  // gun of Demo
		obj.sun();  // sun of Hello
		System.out.println(obj.i);  //10
		System.out.println(obj.j);  //20
	}
}
abstract class Demo
{
	public int i,j;
	public Demo()
	{
		System.out.println("Inside Constructor of Demo");
		i = 10;
		j = 20;	
	}
	public void fun()
	{
		System.out.println("Inside Fun of Demo");
	}
	public void gun()
	{
		System.out.println("Inside gun of Demo");
	}
	public abstract void sun();
}
class Hello extends Demo
{
	public int x,y;
	public Hello()
	{
		System.out.println("Inside Constructor of Hello");
		x = 10;
		y = 20;
	}
	public void fun()
	{
		System.out.println("Inside Fun of Hello");
	}
	public void sun()
	{
		System.out.println("Inside sun of Hello");
	}
}