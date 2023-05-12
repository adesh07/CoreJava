package test.prog.system;

public class Object_01 {

	public void sum(int a, int b) {

		int c = a + b;
		System.out.println("Value of c = " + c);
	}

	public void Multiply(int a, int b) {

		int c = a * b;
		System.out.println("Multiplication = " + c);
	}

	public void PrimeNumber(int ab) {

		int count = 0;

		for (int x = 2; x < ab; x++) {

			if (ab % x == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}

	public void Triangle() {

		for (int a = 1; a <= 10; a++) {

			for (int b = 1; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
