package Program;

public class ObjectClass {
	int price;
	String brand;

	ObjectClass(int price,String brand ){
		this.price=price;
		this.brand=brand;
		
	}
	public static void main(String[] args) {
		ObjectClass c = new ObjectClass(4000,"hp");
		ObjectClass c1 = new ObjectClass(4000,"hp");
		
			System.out.println(c.hashCode());
			System.out.println(c.equals(c1));
			System.out.println(c1.hashCode());
			System.out.println(c==c1);
			System.out.println(c==c);
	}

}
