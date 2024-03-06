package Program;

public class Number1 {

	public static void main(String[] args) {
     int n=1;
     for(int i=1; i<=6; i++) {
    	 for(int j=6; j>=i; j--){
    		 System.out.print(" "); 
    	 }
    	 for(int k=1; k<=i; k++) {
    		 System.out.print(n+" ");
    		 n++;
    	 }
    	 System.out.println();
     }
	}

}
