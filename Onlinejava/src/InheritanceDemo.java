

class Calculator
{
	public int add(int i, int j)
	{
		return i+j;
	}
}
class AdvCalc extends Calculator
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}
class VeryAdvCalc extends AdvCalc
{
	public int multi(int i, int j)
	{
		return i*j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
	
		VeryAdvCalc obj = new VeryAdvCalc();
		int result1 =obj.add(5,3);
		int result2 =obj.sub(7,3);
		int result3 =obj.multi(7,3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		

	}

}
