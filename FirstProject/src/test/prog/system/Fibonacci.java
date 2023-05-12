package test.prog.system;

public class Fibonacci {

	public static void main(String[] args) {

		int N = 12;

		int num1 = 0;
		int num2 = 1;
		int count = 0;

		while (N > count) {

			System.out.println(num1);

			int num3 = num2 + num1;

			num1 = num2;

			num2 = num3;

			count++;
		}
	}
}
