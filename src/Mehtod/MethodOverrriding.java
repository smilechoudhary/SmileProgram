package Mehtod;

 class MethodOverrriding2 {
	 void father() {
		 System.out.println(" father");
		 
	 }
 }

	
	class MethodOverrriding1 extends MethodOverrriding2 {
		void father() {
			System.out.println(" son");
		}
		
	}
	public class MethodOverrriding  {
		public static void main(String[]args) {
			MethodOverrriding1 m= new MethodOverrriding1();
			MethodOverrriding2 n= new MethodOverrriding1();
			MethodOverrriding1 o= ( MethodOverrriding1)n;
			MethodOverrriding2 p= new MethodOverrriding2();
			n.father();
			m.father();
			o.father();
			p.father();
			
			
			
			
			
		}
		
	}


