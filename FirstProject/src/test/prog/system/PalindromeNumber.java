package test.prog.system;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 707;
		int n = num;
		int sum = 0;
		int r;

		while (n > 0) {

			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (num == sum) {
			System.out.println("Yes Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}