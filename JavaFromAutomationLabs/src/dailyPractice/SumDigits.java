package dailyPractice;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		long number = input.nextLong();
		System.out.println("The sum of the digits of given integer is: "+sumDigits(number));

	}

	public static int sumDigits(long number) {
		int  sum =0;
		while(number!=0) {
			sum += number%10;
			number/= 10;
		}
		return sum;
	}
}
