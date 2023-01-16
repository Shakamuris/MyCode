package javaByNaveen;

public class RevInteger {

	public static void main(String[] args) {
		
		long n1 = 19911219;
	    long rev = 0;
	    // By Using while loop
	    while(n1!=0)
	    {
	    	rev = rev*10+n1%10;
	    	n1 = n1/10;
	    }
		System.out.println(rev);

		
		// Using String Buffer class
		int n2 = 19970101;
		System.out.println(new StringBuffer(String.valueOf(n2)).reverse());
	}

}
