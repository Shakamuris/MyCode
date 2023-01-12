package javaByNaveen;

import java.util.Scanner;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String str;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter text with junk: ");
		str= s.next();
		
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);
		s.close();

	}

}
