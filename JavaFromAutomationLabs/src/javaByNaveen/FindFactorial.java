package javaByNaveen;

public class FindFactorial {

	// By using for loop
	public static void factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	//By using Recursive function
	public static int rfact(int num) {
		if(num==0)
		 return 1;
		else
			return (num*rfact(num-1));
	}
	public static void main(String[] args) {
	
		factorial(3);
		System.out.println(rfact(5));
	}

}
