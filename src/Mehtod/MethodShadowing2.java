package Mehtod;

public class MethodShadowing2 extends Upcasting{
	public static void add() {
		System.out.println("hiiiiii");
	}

		public static void main(String[] args) {
MethodShadowing2 m= new MethodShadowing2();

m.add();

		}

	}

