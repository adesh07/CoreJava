package test.prog.system;

public class Method_02 {

	public static void xyz(int a, int b) {

		int c = a - b;

		System.out.println("Difference = " + c);
	}

	public void Armstrong_01(int num) {

		int n = num;
		int r;
		int sum = 0;

		while (n > 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}
		if (sum == num) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}

	public void ReverseNum(int num) {

		int n = num;
		int r;
		int sum = 0;

		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		System.out.println("Reverse = " + sum);
	}

	public void PrimeNum(int num) {

		int n = num;
		int count = 0;

		for (int x = 2; x < n; x++) {
			if (n % x == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Yes Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}