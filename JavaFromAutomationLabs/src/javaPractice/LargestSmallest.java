package javaPractice;

import java.util.Arrays;

public class LargestSmallest {

	public static void main(String[] args) {
		
		int numbers[] = {-12,-45,-6,-7,-8,-21,-24,-56};
		
		int largest = numbers[0];
		int smallest= numbers[0];
		
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest = numbers[i];
			}
			else
			{
				if(numbers[i]<smallest)
				{
					smallest = numbers[i];
				}
			}
		}
		System.out.println("The given array is: "+ Arrays.toString(numbers));
		System.out.println("The largest number is: "+largest);
		System.out.println("The smallest number is: "+smallest);

	}

}
