package dailyPractice;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int number1 = in.nextInt();
		
		System.out.print("Enter second number: ");
		int number2 = in.nextInt();
		
		if(number1 == number2) 
			System.out.println(number1 + " == "+ number2);
		if(number1 != number2) 
			System.out.println(number1 + " != "+ number2);
		if(number1 >= number2) 
			System.out.println(number1 + " >= "+ number2);
		if(number1 <= number2) 
			System.out.println(number1 + " <= "+ number2);
		if(number1 > number2) 
			System.out.println(number1 + " > "+ number2);
		if(number1 < number2) 
			System.out.println(number1 + " < "+ number2);
	}

}
