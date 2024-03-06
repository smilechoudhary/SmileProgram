package Program;

public class New {

	public static void main(String[] args) {
for(int i=1; i<=10; i++) {
	for(int j=1; j<=10; j++) {
		System.out.print(j);
	}
		for(int k=10; k>=i; k--){
			System.out.print("*");
		}
		for(int m=1; m<=i*2-1;m++) {
			System.out.print("&");
		}
		for(int k=10; k>=i; k--){
			System.out.print("*");
		}
		for(int p=1; p<=10; p++) {
				System.out.print(p);	
		}
		System.out.println();
}
int l=10;
for(int x=1;x<=10;x++){
	for(int y=1; y<=10; y++) {
		System.out.print(y);
	}
	for(int z=1; z<=x; z++) {
		
		System.out.print("*");
	}
	for(int m=l*2-1; m>=1;m--) {
		System.out.print("&");	
	}
	l--;
for(int z=1; z<=x; z++) {
		
		System.out.print("*");
	}
for(int p=1; p<=10; p++) {
	System.out.print(p);
}	
	System.out.println();
}
	}
}
	

	


