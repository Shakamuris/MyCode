package toBeDeleted;

import java.util.Scanner;

public class SwapIntegers {

	public static void main(String[] args) {
		System.out.print("Enter integer one: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("Enter integer two: ");
		Scanner sc1 = new Scanner(System.in);
		int y = sc.nextInt();
		System.out.println("Before swapping 1st integer is : " + x);
		System.out.println("Before swapping 2nd integer  is: " + y);
// By using third variable
		// int t;
//		t=x;
//		x=y;
//		y=t;
		// without using third variable & with + operator
//		x=x+y;
//		y=x-y;
//		x=x-y;
		// without using third variable & with * operator
//		x=x*y;
//		y=x/y;
//		x=x/y;
		// without using third variable: Using XOR ^ operator
				x = x ^ y;
				y = x ^ y;
				x = x ^ y;
		System.out.println("After swapping  1st integer is : " + x);
		System.out.println("After swapping  2nd  integer is : " + y);

	}

}
