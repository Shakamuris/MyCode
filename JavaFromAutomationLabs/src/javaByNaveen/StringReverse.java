package javaByNaveen;

public class StringReverse {

	public static void main(String[] args) {
	
		// Reverse a String
		// Difference between String and String buffer
		// Do we have reverse function in String - No
		
		// String is immutable object
		// StringBuffer is mutable object
		
		String str = "Naidu";
		String rev = "";
		
		//using loop
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		// using String buffer class
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
