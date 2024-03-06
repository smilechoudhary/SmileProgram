package Mehtod;

public class M2 {
	

	public static void main(String[] args) {
		Upcasting u= new MethodShadowing2 ();
		MethodShadowing2 v=(MethodShadowing2)u;
		u.add();
		v.add();
	}

}
