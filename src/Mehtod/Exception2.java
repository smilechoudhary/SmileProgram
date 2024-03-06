package Mehtod;

public class Exception2 {
	public void hello() throws NullPointerException {
		int a=0/0;
		System.out.println("hello muskan");
	}

	public static void main(String[] args) {
try {
	Exception2 e= new Exception2();
	e.hello();
}
catch(Exception e){
	System.out.println(e.getMessage());
	System.out.println("correct your exception");
}
finally {
	System.out.println("finally execute at any condition");
}
	}

}
