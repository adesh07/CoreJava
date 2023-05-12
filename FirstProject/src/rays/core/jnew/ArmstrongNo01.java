package rays.core.jnew;

public class ArmstrongNo01 {

	public static void main(String[]args) {
		
		int num = 371;
		int n = num;
		int sum = 0;
		int r;
		
		while( n > 0) {
			r = n % 10;
			sum = n + (r*r*r);
			n = n / 10;
		}
		if (num == sum) {
			System.out.println("Yes Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
}