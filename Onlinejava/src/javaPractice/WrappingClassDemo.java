package javaPractice;

public class WrappingClassDemo {

	public static void main(String[] args) {
	
		
		int i = 5;  // Premitive
		
		Integer ii = new Integer(i);  //boxing
		int j = ii.intValue(); // unboxing
		
		
		Integer value = i;  // Autoboxing
		
		int k = value;  //  Autounboxing
		

	}

}
