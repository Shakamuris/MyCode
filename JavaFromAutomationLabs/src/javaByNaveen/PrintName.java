package javaByNaveen;

public class PrintName {

	public static void main(String[] args) {
		String v = "Vaishnavi";
		String s = "r";
		
		s=s.replaceAll("r", "rrrrrrrrrr"); //10
		s=s.replaceAll("r", "rrrrrrrrrr"); //10x10=100
		s=s.replaceAll("r", "rrrrrrrrrr"); //100x10 = 1000
		
		s=s.replace("r", v+ "\n");
		System.out.println(s);

	}

}
