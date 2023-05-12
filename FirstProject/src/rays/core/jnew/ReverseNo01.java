package rays.core.jnew;

    public class ReverseNo01{
    	
    	public static void main(String[]args) {
    		
    		int number = 547951;
    		int sum = 0;
    		int x = number;
    		int remain;
    		
    		while(x > 0) {
    			
    			remain = x % 10;
    			sum = sum * 10 + remain;
    			x = x / 10;
    		}
    		System.out.println("Reverse = "+sum);
       }
    }