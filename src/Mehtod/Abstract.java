package Mehtod;

public abstract class Abstract {
	static int a=10;
	int b=20;

	public static void add() {
		System.out.println(" static method ");
		
	}
	abstract void ab();
	public void nonstatic() {
		System.out.println(" non static method");
		
	}
	static
	{
		System.out.println("static initializer");
	}
		
{
	System.out.println(" non static initialzer");
	}
Abstract(){
	System.out.println(" constructor");
}

	
		
	
	

}
