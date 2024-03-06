package Mehtod;

public class Interface2 implements Interface{
	
	public  void add(){
		System.out.println("implemented");
	}
	
	public  void test() {
		System.out.println("implemented");
	}

	public static void main(String[] args) {

		Interface2 i= new Interface2();
		i.add();
		i.test();
		
	}

}
