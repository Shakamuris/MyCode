package dailyPractice;

import java.util.Scanner;

//program that takes a number as input and prints its multiplication table up to 10
public class PrintTable {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a table number you want: ");
		int num = in.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1)));
		}

	}

}
