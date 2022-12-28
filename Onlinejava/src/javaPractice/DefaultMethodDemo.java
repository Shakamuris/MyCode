package javaPractice;

interface Demo
{
	public void abc();
	default void show()
	{
		System.out.println("In Show");
	}
}

class ImpDemo implements Demo
{
	public void abc()
	{
		System.out.println("in Abc");
	}
	public void show()
	{
		System.out.println("In New Show");
	}
}

public class DefaultMethodDemo {

	public static void main(String[] args) {
	
		Demo obj = new ImpDemo();
		obj.abc();
		obj.show();
	}

}
