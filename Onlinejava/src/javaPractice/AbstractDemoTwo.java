package javaPractice;

class Printer
{
//	public void show(Integer i)
//	{
//		System.out.println(i);
//	}
//	public void show(double i)
//	{
//		System.out.println(i);
//	}
	
	public void show(Number i)
	{
		System.out.println(i);
	}
}

public class AbstractDemoTwo {

	public static void main(String[] args) {
		// 

		Printer obj = new Printer();
		obj.show(5);

	}

}
