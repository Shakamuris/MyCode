
class Casio
{
	public void add(int p, int q)
	{
		System.out.println(p+q);
	}
	public void add(int p, int q, int r)
	{
		System.out.println(p+q+r);
	}
	public void add(double p, double q)
	{
		System.out.println(p+q);
	}
	public void add(float p, float q, float r)
	{
		System.out.println(p+q+r);
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
	
		Casio obj = new Casio();
		obj.add(5, 3);
		obj.add(5,3,2);
		obj.add(5.2,5.2);
		obj.add(5,5,5);
	}

}
