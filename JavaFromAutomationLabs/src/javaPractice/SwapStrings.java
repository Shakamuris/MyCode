package javaPractice;

import java.util.Scanner;

public class SwapStrings {
	public static void main(String[] args) {
		System.out.print("Enter string one: ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.print("Enter string two: ");
		Scanner sc1 = new Scanner(System.in);
		String s2 = sc1.next();
		System.out.println("Before Swapping: ");
		System.out.println("String 1: " + s1);
		System.out.println("String 2: " + s2);
		System.out.println("*******");
		s1 = s1 + s2;
		System.out.println(s1);
		System.out.println("*******");
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After Swapping: ");
		System.out.println("String 1: " + s1);
		System.out.println("String 2: " + s2);
	}
}
