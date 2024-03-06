package Mehtod;

class MethodShadowing {

	static void vehicle() {
		System.out.println(" i m vehicle ");
	}
	
}
class MethodShadowing1 extends MethodShadowing {
	static void vehicle() {
		System.out.println(" i m  vehicle of m1");
	}
	
}

public class MethodShadowing3 {

	public static void main(String[] args) {
		 MethodShadowing m= new  MethodShadowing();
		 m.vehicle();
		 MethodShadowing1 n=new MethodShadowing1();
		 n.vehicle();
		 MethodShadowing a=new MethodShadowing1();
		 a.vehicle();
		 MethodShadowing1 b=(MethodShadowing1)a;
		 b.vehicle();
		 
	}

}
