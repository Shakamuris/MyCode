
class King
{
	int num1;
	int num2;
	String operation;
	
	public King()
	{
		num1 =5;
		num2 =4;
	}
	public King(int i, int j)
	{
		num1 =i;
		num2 =4;
		operation = "Nothing";
	}
	public King(int i, int j, String k)
	{
		num1 =i;
		num2 =4;
		operation ="op";
	}
}

public class ConsturctorOverLoading {

	public static void main(String[] args) {
	
		King obj = new King(5,4,"op");
	}

}
