package rays.core.jnew;

public class StringCharRepeat{
	
	public static void main(String[] args) {
		
		String tn = "Defence of the ancient";
		
		char idk = 'e';
		
		int count = 0;
		
		for(int gh = 0; gh < tn.length(); gh++ ) {
			
			if(tn.charAt(gh) == idk) {
				
				count++;
			}
		}
		System.out.println(idk+" Repeated = "+count);
	}
}