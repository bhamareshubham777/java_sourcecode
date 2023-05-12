// Function overloading

import java.lang.*;

class Overloading
{
	public static void main(String arg[])
	{
		int iret = 0;
		float fret = 0.0f;
		
		Addition obj = new Addition();
		
		iret = obj.Add(10,11);
		System.out.println("Addition of two integers: "+iret);

		fret = obj.Add(10.5f,11.3f);
		System.out.println("Addition of two floats: "+fret);

		iret = obj.Add(10,11,30);
		System.out.println("Addition of three integers:"+iret);		

		obj.Fun(10,10.5f);
		obj.Fun(11.3f,20);
	}
}
class Addition
{
    // overloading by changing datatypes
	
	public int Add(int ino1, int ino2)
	{
		return ino1 + ino2;
	}
	public float Add(float fno1, float fno2)
	{
		return fno1 + fno2;
	}

   // overloading by changing number of argument

	public int Add(int ino1, int ino2, int ino3)
	{
		return ino1 + ino2 + ino3;
	}

   // overloading by changing sequence of datatypes

	public void Fun(int i, float f)
	{
		System.out.println("Inside First Fun");
	}
	public void Fun(float f, int i)
	{
		System.out.println("Inside second fun");
	}
}