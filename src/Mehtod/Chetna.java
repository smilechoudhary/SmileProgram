package Mehtod;

public class Chetna {
	private String a ="smile";
	
	public String geta() {
		return a;
	}
	public void seta(String a) {
		this.a=a;
	}

	public static void main(String[] args) {
    Chetna c = new Chetna();
    System.out.println(c.a);
	}

}
