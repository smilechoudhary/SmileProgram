package Mehtod;

public class Downcasting extends Upcasting {
	public void add() {
		System.out.println("byeee");
	}

	public static void main(String[] args) {
		Upcasting u=new Upcasting();
		Downcasting d= new Downcasting();
		Downcasting s= (Downcasting)u;
		u.add();
		s.add();
	}

}
