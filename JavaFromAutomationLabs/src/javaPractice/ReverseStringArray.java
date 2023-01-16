package javaPractice;

public class ReverseStringArray {

	public static void main(String[] args) {
	
		 String Myarr[] = {"Rajesh","is","Name","My"};
		 
		 System.out.println("The lenght of the array is: "+ Myarr.length);
		 System.out.print("Reverse of String array is: ");
		 for(int i =Myarr.length-1;i>=0;i--)
		 {
			 System.out.print(Myarr[i]+" ");
		 }

	}

}
