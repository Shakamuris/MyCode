class P
{
	public void show()
	{
		System.out.println("In P");
	}
}

class Q extends P
{
	public void show()
	{
		super.show();
		System.out.println("In Q");
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Q obj =  new Q();
		obj.show();

	}

}
