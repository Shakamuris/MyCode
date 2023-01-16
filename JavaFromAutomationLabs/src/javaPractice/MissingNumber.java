package javaByNaveen;

public class MissingNumber {

	public static void main(String[] args) {
		
		int numbers[] = {1,2,3,4,6,7,8,9,10};
		
		int sum =0;
		int sum1= 0;
		
		for(int i=0;i<numbers.length;i++)
		{
			sum = sum+numbers[i];
		}

		for(int j=1;j<=10;j++)
		{
			sum1= sum1+j;
		}
		
		System.out.println("Missing number is: "+ (sum1-sum));
	}

}
