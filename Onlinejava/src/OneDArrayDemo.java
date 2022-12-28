
class Students
{
	int rollno;
	String name;
}


public class OneDArrayDemo {

	public static void main(String[] args) {
//		int nums[] = new int[4];
//		nums[0]=12;
//		nums[1]=42;
//		nums[2]=24;
//		nums[3]=21;
//		
		int nums[] = {12,42,24,21};
		
		for (int i=0;i<4;i++) {
			System.out.println(nums[i]);
		}
		
		
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();
		Students s4 = new Students();
		
		// instead of creating 4 objects above, we can create one S object below
		
//		Students s[] = new Students[4]; -----> instead of writing this way, we can write below
		
		Students s[] = {s1,s2,s3,s4};
			
	}

}
