package rays.core.jnew;

public class ReverseString {

	public static void main(String[] args) {
	
		String[] s = {"Hello Java Program"};
				
		for(String x : s) {
			
			for(int i = x.length()-1; i >= 0; i--) {
				
				System.out.print(x.charAt(i));
			}
		}
	}
}
