class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	

	public Emp()        // Constructor will be execurted everytime when you create an object
	{
		eid = 1;
		salary = 5000;
		System.out.println("in Constructor");
	}
	
	static             // static block will be executed only once when you load a class
	{
		ceo = "Naidu";
		System.out.println("in Static");
	}
	
	public void show()
	{
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		
		Emp suresh = new Emp();
//		suresh.eid = 21;
//		suresh.salary = 3000;
//		Emp.ceo = "Rajesh";
		
		Emp ramesh = new Emp();
//		ramesh.eid = 22;
//		ramesh.salary = 4000;
//		Emp.ceo = "Rajesh";
		
		
//		Emp.ceo ="Reddy";
		
		suresh.show();
		ramesh.show();
	}

}
