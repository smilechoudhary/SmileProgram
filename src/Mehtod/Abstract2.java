package Mehtod;

public class Abstract2 extends Abstract{
	 void ab() {
		System.out.println(" define abstract mandotory");
	}
	 public void nonstatic() {
			System.out.println(" i am non static method");
			
		}
	public static void main(String[] args) {
		Abstract2 a= new Abstract2();
		a.add();
		a.ab();
		a.nonstatic();
		 

	}

}
