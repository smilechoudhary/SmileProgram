package Program;

public class Chetna {

	public static void main(String[] args) {
		int x=1;
for(int i=1; i<=5;i++){

	for(int j=5; j>=i; j--) {
		System.out.print("   ");
	}
	for(int k= 1; k<=(i*2)-1; k++) {
		if(x<10)
	System.out.print("0"+x+" ");
		else
	System.out.print(+x+" ");	
		x++;
	}
	System.out.println();
	}
	}
}
//for(int i=5; i>=1;i--){
//
//	for(int j=5; j>=i; j--) {
//		System.out.print("		");
//	}
//	for(int k= 1; k<=(i*2)-1; k++) {
//
//		System.out.print(x+"	");
//		x++;
//	}
//	System.out.println();
//	}
//}
//}

		
	


