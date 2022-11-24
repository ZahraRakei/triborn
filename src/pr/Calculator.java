package pr;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Calculator c = new Calculator();
		c.addition(2,3);
		c.subtraction(6, 4);

	}
	
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	public void subtraction(int a,int b) {
		System.out.println(a-b);
	}

}
