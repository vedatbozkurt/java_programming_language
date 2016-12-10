public class MyMathMethods 
{
	// returns the maximum of its three double parameters
	public static double maximum( double x, double y, double z )
	{
	  double maximumValue = x; // assume x is the largest to start

	  // determine whether y is greater than maximumValue
	  if ( y > maximumValue )
		 maximumValue = y; 

	  // determine whether z is greater than maximumValue
	  if ( z > maximumValue )
		 maximumValue = z;

	  return maximumValue;
	} // end method maximum
}