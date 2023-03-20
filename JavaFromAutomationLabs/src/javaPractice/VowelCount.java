package javaPractice;

public class VowelCount {

	public static void main(String[] args) {
		
		String s1="Rajesh Babu Naidu";
		int len = s1.length();
		int vowelCount = 0;
		for(int i=0;i<len;i++)
		{
			char c = Character.toLowerCase(s1.charAt(i)) ;
			if(c=='a' | c=='e'| c=='i'| c=='o'|c=='u')
			{
				vowelCount++;
			}
		}
		System.out.println("The count of vowels in the string is: "+vowelCount);

	}

}
