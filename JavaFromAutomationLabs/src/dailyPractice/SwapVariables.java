package dailyPractice;

public class SwapVariables {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		a= a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The Value of A after swapping: "+a);
		System.out.println("The Value of A after swapping: "+b);

	}

}
