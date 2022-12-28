class Key
{
	int num1;
	int num2;
	int result;
	
	public Key(int num1, int num2)
	{
		this.num1 =num1;
		this.num2 =num2;
	}
	
}

public class ThisKeyword {

	public static void main(String[] args) {
	
        Key obj = new Key(5,7);
        
        System.out.println(obj.num1);
        System.out.println(obj.num2);
	}

}
