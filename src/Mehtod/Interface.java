package Mehtod;

public interface Interface {
	public  void add(); //by default abstract method
	public int a=10;
//	Interface(){ 	we can't create construstor
//	}
//	static {      we can't create initilaizer
//	}
//	public void old() { we can't create non static method
//	}
	public static void demo() { //we can create static method with body
		
	}
	public abstract void test();
	public static void main (String[]args) {
		demo();
	}
	

}
