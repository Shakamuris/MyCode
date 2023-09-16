package dailyPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string to reverse it: ");
		char[] strin = input.nextLine().toCharArray();
		
		for(int i= strin.length-1;i>=0;i--) {
			System.out.print(strin[i]);
		}
		

	}

}
