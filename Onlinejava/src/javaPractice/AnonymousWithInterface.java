package javaPractice;

interface Pqr {
	void show();
}

public class AnonymousWithInterface {

	public static void main(String[] args) {

		Pqr obj = new Pqr() 
		                {
			               public void show()
			               {
				             System.out.println("Anything");
			                }
		                };
		obj.show();
	}

}