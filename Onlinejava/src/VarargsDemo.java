
class Varargs
{
	public int add(int...n)
	{
		int sum=0;
		for(int i:n)
		{
			sum = sum+i;
		}
		return sum;
	}
}
public class VarargsDemo {

	public static void main(String[] args) {
	
		Varargs obj = new Varargs();
		System.out.println(obj.add(2,7,8,9,4,2,6,4,3,7));
	}

}
