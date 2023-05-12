package test.prog.system;

public class Reverse_at_place {

	public static void main(String[] args) {

		String name = "Defence of the ancient";

		String[] str = name.split(" ");

		for (String str1 : str) {

			for (int k = str1.length() - 1; k >= 0; k--) {

				System.out.print(str1.charAt(k));
			}
			System.out.print(" ");
		}
	}
}