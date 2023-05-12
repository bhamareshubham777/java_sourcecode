class FinalMethod
{
	public static void main(String arg[])
	{
		Base bobj = new Derived();	// Upcasting
		bobj.fun();
		FinalMethod.gun();
	}

	public static void gun()
	{
		final int no =11;
		System.out.println("Static fun");
		//no++;
	}
}
class Base
{
	public void fun()
	{
		System.out.println("Base fun");
	} 
	public final void gun()	// Method that we cant override
	{
		System.out.println("Base gun");
	}
}

class Derived extends Base
{
	public void fun()  // Override
	{
		System.out.println("Derived fun");
	} 
	/*public void gun()
	{
		System.out.println("Derived gun");
	}*/
}