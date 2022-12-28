package javaPractice;

class Student{
	private int rollno;
	private String name;
	
	// getters and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {
	
		Student s = new Student();
		s.setRollno(7);
		s.setName("Rajesh");
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());

	}

}
