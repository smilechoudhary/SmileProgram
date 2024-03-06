package Mehtod;

public class ExceptionHandling {
	public void add() throws ArithmeticException,NullPointerException{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("hii");
		try {
			ExceptionHandling e = new ExceptionHandling();
			e.add();
			}
		catch(Exception i) {
	System.out.println(i.getMessage());
			i.printStackTrace();
		}
	}

}
