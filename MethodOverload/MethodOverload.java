public class MethodOverload
{
	public static void main(String[] args)
	{
		int intValue = 0;
		double doubleValue = 0.0;
		
		myMethod();
		myMethod(intValue);
		myMethod(intValue, intValue);
		myMethod(doubleValue);
		myMethod(intValue,doubleValue);
		myMethod(doubleValue,intValue);
	}
	
	//Method 1
	public static void myMethod()
	{
		System.out.println("Method 1 is called...");
	}
	//Method 2
	public static void myMethod(int p1)
	{
		System.out.println("Method 2 is called...");
	}
	//Method 3
	public static void myMethod(int p1, int p2)
	{
		System.out.println("Method 3 is called...");
	}
	//Method 4
	public static void myMethod(double p1)
	{
		System.out.println("Method 4 is called...");
	}
	//Method 5
	public static void myMethod(int p1, double p2)
	{
		System.out.println("Method 5 is called...");
	}
	//Method 6
	public static void myMethod(double p1 ,int p2)
	{
		System.out.println("Method 6 is called...");
	}
}