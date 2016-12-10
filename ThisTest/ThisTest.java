// this used implicitly and explicitly to refer to members of an object.

public class ThisTest 
{
   public static void main( String[] args )
   {
      SimpleTime time = new SimpleTime( 15, 6, 19 );
	  time.display();
   } // end main
} // end class ThisTest

// class SimpleTime demonstrates the "this" reference
class SimpleTime 
{
   private int hour; // 0-23
   private int minute; // 0-59
   private int second; // 0-59 

   // if the constructor uses parameter names identical to 
   // instance variable names, the "this" reference is 
   // required to distinguish between the names
   public SimpleTime( int hour, int minute, int second )
   {
      this.hour = hour; // set "this" object's hour
      this.minute = minute; // set "this" object's minute
      this.second = second; // set "this" object's second
   } // end SimpleTime constructor

   //display the time as formated time style
   public void display()
   {
		System.out.printf("%02d:%02d:%02d", hour, minute, second);
   }
} // end class SimpleTime
