class Unnamed
{
	public static void main(String arg[])
	{
		System.out.println("Inside Main");
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(10,20);
	}
}
class Demo
{
	public int i,j;
	public static int x,y;

	{
		System.out.println("Inside unnamed block");
		i = 10;
		j = 20;
		// common logic
	}
	public Demo()
	{
		System.out.println("Inside Default");
	}	
	public Demo(int a, int b)
	{
		System.out.println("Inside Parameterised");
	}
	static
	{
		System.out.println("Inside Static block");
		x = 10;
		y = 20;
	}
}