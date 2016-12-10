public class ConstructorOverloadTest
{
	public static void main(String[] args)
	{
		int intValue = 0;
		double doubleValue = 0.0;
		
		ConstructorOverload mo1 = new ConstructorOverload();
		ConstructorOverload mo2 = new ConstructorOverload(intValue);
		ConstructorOverload mo3 = new ConstructorOverload(intValue, intValue);
		ConstructorOverload mo4 = new ConstructorOverload(doubleValue);
		ConstructorOverload mo5 = new ConstructorOverload(intValue,doubleValue);
		ConstructorOverload mo6 = new ConstructorOverload(doubleValue,intValue);
	}
}	