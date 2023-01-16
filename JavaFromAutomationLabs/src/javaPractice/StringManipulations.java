package javaPractice;

public class StringManipulations {

	public static void main(String[] args) {
		String str = "My Name is Reddy Rajesh Sakamoori";
		String str1 = "My Name is REddy Rajesh Sakamoori";
		
		// to find out length of the string
		System.out.println(str.length());
		
		// to find out the index of the character in the string.
		System.out.println(str.charAt(19));
		
		// to find out the first occurrence of character in the String
		System.out.println(str.indexOf('e'));
		
		// to find out the second occurrence of character in the String
		System.out.println(str.indexOf('e', str.indexOf('e')+1));
		
	   // to find out the second occurrence of character in the String
		System.out.println(str.indexOf('e', str.indexOf('e', str.indexOf('e')+1)+1));
		
	   // to find out the index position of sub string
		System.out.println(str.indexOf("Rajesh"));
		
	   // to validate if character is not available in the string
		System.out.println(str.indexOf('z'));  // which returns -1 
		
	   // to compare two strings
		System.out.println(str.equals(str1));  // which returns boolean
		
	   // compare but ignore the case small or capital
		System.out.println(str.equalsIgnoreCase(str1));
		
	  // to fetch the sub-string
		System.out.println(str.substring(17,23));
		
	  // to trim the string
		String str2 = "  Chowdary garu   ";
		// trim method remove only before and after space of the String
		System.out.println(str2.trim());  
		
	 // to trim the space between the strings
		System.out.println(str2.replace(" ", ""));
		
	 // to replace the characters in string
		String date = "01-01-1997";
		System.out.println(date.replace("-", "/"));
		
	 // to split the string
	  String baby = "Shakamuri_Avyaan_babu_Garu"; 
	   // split method always returns String Array.
	  // so we need to store it in string type Array
	  String babyboy[]= baby.split("_"); 
	  for(int i=0;i<babyboy.length;i++)
	  {
		  System.out.println(babyboy[i]);
	  }
	 // to concatenate string
	  String name = "Avyaan ";
	  String secondname = "Naidu";
	  System.out.println(name.concat("Chowdary"));
	  System.out.println(name.concat(secondname));

	  int a = 12;
	  int b = 7;
	  System.out.println(name+secondname);
	  System.out.println(a+b);
	  System.out.println(name+secondname+a+b);
	  System.out.println(name+secondname+(a+b));
	  System.out.println(a+b+name+secondname);
	}

}
