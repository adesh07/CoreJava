
public class Full_method_02 {

	public static int Num(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}

	public int Prime(int a) {

		int ct = 0;

		for (int k = 2; k < a; k++) {
			if (a % k == 0) {
				ct++;
			}
			if (ct == 0) {
				System.out.println("Prime Num");
			} else {
				System.out.println("Not Prime");
			}
		}

		return a;
	}

	public int Armst(int a) {

		int j = a;
		int t;
		int h = 0;

		while (j > 0) {
			t = j % 10;
			h = h + (t * t * t);
			j = j / 10;
		}
		if (h == a) {
			System.out.println("Yes Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}

		return a;
	}

	public int Rev(int kl) {

		int v = kl;
		int hp;
		int you = 0;

		while (v > 0) {

			hp = v % 10;
			you = you * 10 + hp;
			v = v / 10;
		}

		System.out.println("Reverse = " + you);

		return kl;
	}

	public int Div_07(int a) {

		int count = 0;
		int sum = 0;

		for (int i = 100; i <= 200; i++) {
			if (i % a == 0) {
				count = i;
				System.out.println("No. Divi = " + count);
				sum = sum + count;
			}
		}
		System.out.println("Sum = " + sum);

		return a;
	}
}