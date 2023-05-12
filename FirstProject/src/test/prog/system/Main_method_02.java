package test.prog.system;

public class Main_method_02 {

	public static void main(String[] args) {
		
		Method_02.xyz(100,40);  // directly executed b/c 'static' method
		
		Method_02 lol = new Method_02();   // Object Declaration & Creation
		
		lol.Armstrong_01(371);
		
		lol.ReverseNum(4567);
		
		lol.PrimeNum(7);
	}
}