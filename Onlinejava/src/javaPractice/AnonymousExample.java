package javaPractice;

class P {
	public void show() {
		System.out.println("In A");
	}
}

public class AnonymousExample {

	public static void main(String[] args) {

		P obj = new P() {
			public void show() {
System.out.println("I am the Best");
			}
		};
		obj.show();
	}

}
