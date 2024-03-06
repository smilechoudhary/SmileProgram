package Mehtod;

public class Mehtod {
	int a=10;
	int d=20;
	void add() {
		
		System.out.println(d);
		int b=40;
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		Mehtod m= new Mehtod();
		//Mehtod n= new Mehtod(10);
//		Mehtod o= new Mehtod(20,30);
		System.out.println(m.a);
		m.add();


		

	}
Mehtod(){
	this(10);
	int c=90;
	System.out.println(c);
	
	
}
Mehtod(int a){
	this(20,30);
	a= 10;
	System.out.println(a);
	
}
Mehtod(int a ,int b){
	a=20;
	b=30;
	System.out.println(a);
	System.out.println(b);
	
	
}
}
