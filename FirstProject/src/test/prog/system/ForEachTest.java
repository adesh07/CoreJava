package test.prog.system;

public class ForEachTest {

	public static void main(String[] args) {

		String op = "This is Java Program";

		String[] htp = op.split(" ");

		for (String G : htp) {

			for (int x = G.length() - 1; x >= 0; x--) {

				System.out.print(G.charAt(x));
			}
			System.out.print(" ");
		}
	}
}