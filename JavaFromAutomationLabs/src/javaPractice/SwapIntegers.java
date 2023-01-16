package javaPractice;

public class SwapIntegers {

	public static void main(String[] args) {

		int x = 7;
		int y = 9;

		System.out.println("x value is: " + x);
		System.out.println("Y value is: " + y);
// by using third variable
		// int t;
		// t=x;
		// x=y;
		// y=t;
// without using third variable: Using + operator
		// x = x+y;
		// y = x-y;
		// x = x-y;
// without using third variable: Using * operator	
		// x = x*y;
		// y = x/y;
		// x = x/y;
// without using third variable: Using XOR ^ operator
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;

		System.out.println("After swapping x value is: " + x);
		System.out.println("After swapping y value is: " + y);

	}

}
