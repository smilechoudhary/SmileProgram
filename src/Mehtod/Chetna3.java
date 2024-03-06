package Mehtod;

public class Chetna3 {
	private String a ="smile";
	
	public String geta() {
		return a;
	}
	public void seta(String a) {
		this.a=a;
	}
	Chetna3(){
		this(10);
	}
Chetna3(int a){
		this(20 ,30);
		System.out.println(a);System.out.println(a);
	}
Chetna3(int a, int b){
	System.out.println(a);
	System.out.println(b);
}

	

	public static void main(String[] args) {
    Chetna3 c = new Chetna3();
    System.out.println(c.a);
	}

}
