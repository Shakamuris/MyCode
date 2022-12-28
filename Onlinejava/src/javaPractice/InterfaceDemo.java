package javaPractice;


interface Abc
{
	void show();
}
class Implementor implements Abc
{
	public void show()
	{
		System.out.println("Anything");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		Abc obj = new Implementor();
		obj.show();
	}

}
