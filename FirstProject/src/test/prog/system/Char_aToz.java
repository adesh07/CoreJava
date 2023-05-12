package test.prog.system;

public class Char_aToz {

	public static void main(String[] args) {

		String st = "welcome to our planet earth";

		int count = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {

			for (int k = 0; k < st.length(); k++) {

				if (st.charAt(k) == ch) {

					count++;
				}
			}
			if (count >= 0) {

				System.out.println(ch + " = " + count);

				count = 0;
			}
		}
	}
}
