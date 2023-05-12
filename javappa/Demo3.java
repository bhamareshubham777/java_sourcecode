import java.util.*;

class Demo3
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Radius");
		float value = sobj.nextFloat();
		Marvellous mobj = new Marvellous();
		float fret = 0.0f;
		fret = mobj.area(value);
		System.out.println("Area is:"+fret);
		fret = mobj.circumferance(value);
		System.out.println("circumferance is:"+fret);
		System.out.println("Value of PI is:"+Circle.PI);
		//Circle.PI = 6.14f; //Error
	}
}

interface Circle
{
	float PI = 3.14f;   // public static final
	float area(float radius);   // public abstract
	float circumferance(float radius);
}
class Marvellous implements Circle
{
	public float area(float radius)
	{
		float ret = 0.0f;
		ret = PI * radius * radius;
		return ret;
	}
	public float circumferance(float radius)
	{
		float ret = 0.0f;
		ret = 2 * PI * radius;
		return ret;
	}
}