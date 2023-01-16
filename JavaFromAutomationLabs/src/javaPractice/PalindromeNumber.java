package javaPractice;

public class PalindromeNumber {

	public static void isPalindromeNumber(int num)
	{
		int rev=0;
		int temp;
		temp = num;
		
		while(num!=0)
		{
			rev = rev*10+num%10;
			num = num/10;
		}
		if(temp==rev)
		{
			System.out.println("Given number is a Palindrome");
		}
		else
		{
			System.out.println("Given number is not a Palindrome");
		}
		
	}
	public static void main(String[] args) {
		
		isPalindromeNumber(424);
	}

}
