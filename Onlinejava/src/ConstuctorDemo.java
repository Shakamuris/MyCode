class Math
{
	int num1;
	int num2;
	int result;
	
	
	public Math()
	{
		num1 = 5;
		num2 = 6;
		
	}
	public Math(int n)
	{
		num1 = n;
	}
	public Math(float d, int j)
	{
		num1 = (int) d;
		num2 = j;
	}
}


public class ConstuctorDemo {

	public static void main(String[] args) {
		
		Math obj = new Math(2.5f,8);  // constructor
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		
	}

}
