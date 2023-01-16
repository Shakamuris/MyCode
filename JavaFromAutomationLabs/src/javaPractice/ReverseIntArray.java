package javaPractice;

public class ReverseIntArray {

	public static void main(String[] args) {
	
		int arr[] = {1,3,6,7,8};
		
		System.out.println("Array lenght is: "+ arr.length);
		
		System.out.print("Array in Reverse Order: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
