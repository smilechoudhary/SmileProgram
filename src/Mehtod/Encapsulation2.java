package Mehtod;

public class Encapsulation2 {
	private String name="punjab";
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
Encapsulation2 e=new Encapsulation2();
e.setname("smile");
System.out.println(e.name);
		
	}

}
