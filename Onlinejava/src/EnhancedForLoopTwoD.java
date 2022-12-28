
public class EnhancedForLoopTwoD {

	public static void main(String[] args) {
		
		int b[][] = {{1,2,3,4},{9,8,7,6},{4,5,6,7,8}};
		
		for(int i[]: b)
		{
			for(int j: i)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}

	}

}
