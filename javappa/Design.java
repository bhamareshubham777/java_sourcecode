
class Singleton
{
	public int x,y;
	private static Singleton obj = new Singleton();

	private Singleton()
	{
		System.out.println("Inside Constructor");
	}

	public static Singleton GetObject()
	{
		return obj;
	}
}

class Design
{
	public static void main(String arg[])
	{
		//Singleton obj = new Singleton();
		Singleton sobj = Singleton.GetObject();
	}
}