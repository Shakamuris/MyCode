package javaPractice;

@FunctionalInterface
interface MN
{
	void show();
}
public class LambdaExpressionDemo {

	public static void main(String[] args) {
	
		 MN obj = ()->System.out.println("I am the Best");
		 obj.show();

	}

}
