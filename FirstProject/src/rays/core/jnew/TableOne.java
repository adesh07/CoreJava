package rays.core.jnew;

public class TableOne{
	
	public static void main(String[]args) {
		
		for (int a = 1; a <= 5; ++a) {
			
			for(int b = 1; b <= 10; ++b) {
				
				System.out.print( a * b + "\t");      //this is working horizontally
			}
			System.out.println();  
		}
	}
}