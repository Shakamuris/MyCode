
class Calc {
	
	int num1;
	int num2;
	int result;
	
	public void perform()
	{
		result =num1+num2;	
	}
}

public class ClassAndObjectDemo {

	public static void main(String[] args) 
	{
		Calc cl = new Calc();
		
		cl.num1 =5;
		cl.num2 =4;
		cl.perform();
		
		System.out.println(cl.result);

	}

}
