
/*
 * Inner class
 * 
 *    Member class (without static keyword)
 *    Static class (with static keyword)
 *    Anonym ous class
 * 
 * */

class Outer
{
	static int i;
	static public void show()
	{
		System.out.println("outer class method");
	}
	
	static class Inner     //outer$Inner.class
	{
		public void display()
		{
			System.out.println("In display");
		}
		
	}
}


public class InnerDemo {

	public static void main(String[] args) {
		
		Outer obj = new Outer();
	     obj.show(); 
	     
	     Outer.Inner obj1 = new Outer.Inner();
	     obj1.display();
	}

}
