package Mehtod;

public class Concerete extends Abstract {
	//abstract void add(); we can't create abstract method
	void ab() {
		System.out.println(" im abstract ");
	}
static void aa() {
	
	System.out.println(" static method possible");
}
void abb() {
	System.out.println("  non static method possible");
}
Concerete(){
	System.out.println("  constructor possible");
}
static {
	System.out.println(" static initilaizer possible");
}
{
	System.out.println("non"
			+ " static initilaizer possible");
}

	public static void main(String[] args) {
		Concerete c= new Concerete();
		c.aa();
		c.ab();
		

	}

}
