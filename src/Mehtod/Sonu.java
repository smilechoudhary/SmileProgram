package Mehtod;

public class Sonu {
	static int a=20;
	

	 Sonu(){ 
		 this(23);
	 }
	 
	Sonu(int a){
		this("sonu", 23);
	}
	
	Sonu(String name, int age){
		
	}
	
	  void sonu ()
	{
		System.out.println(this.a);
	}

	public static void main(String[] args) {
			Sonu s = new Sonu();
			s.sonu();
	}

}
