package Mehtod;

public class Chetna4 extends Chetna3{
	private String a ="smile";
	
	public String geta() {
		return a;
	}
	public void seta(String a) {
		this.a=a;
	}

	public static void main(String[] args) {
    Chetna4 c = new Chetna4();
    System.out.println(c.a);
	}
	Chetna4(){
		super(10,20);
	}

}
