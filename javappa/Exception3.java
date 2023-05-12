import java.util.Scanner;

class Demo
{
	public float Division(int x, int y)throws ArithmeticException
	{
		float ans = 0.0f;
		ans = x / y;
		return ans;
	}
}
class Exception3
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iNo1 = 0, iNo2 = 0;
		float result = 0.0f;
	
		Demo dobj = new Demo();

		System.out.println("Enter First Number");
		iNo1 = sobj.nextInt();
		System.out.println("Enter Second Number");
		iNo2 = sobj.nextInt();
		
		try
		{
			result = dobj.Division(iNo1,iNo2);
			System.out.println("Division is : "+result);
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Exception ocurred");
		}
	}
}