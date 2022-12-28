package javaPractice;

abstract class Human
{
	public abstract void eat();  // just declaring a method by using abstract keyword
	public void walk()
	{
		
	}
}
class Man extends Human
{
	public void eat()
	{
		
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		
		Human obj = new Man();

	}

}
