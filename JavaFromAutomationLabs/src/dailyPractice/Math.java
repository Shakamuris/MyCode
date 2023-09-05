package dailyPractice;

import java.util.Scanner;

public class Math {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first Number: ");
		int num1 = in.nextInt();
		System.out.print("Enter second Number: ");
		int num2 = in.nextInt();
		
		System.out.println(num1 + " + " + num2 + " ="+ (num1+num2));
		System.out.println(num1 + " * " + num2 + " ="+ (num1*num2));
		System.out.println(num1 + " - " + num2 + " ="+ (num1-num2));
		System.out.println(num1 + " / " + num2 + " ="+ (num1/num2));
		System.out.println(num1 + " % " + num2 + " ="+ (num1%num2));
		
	}
}
