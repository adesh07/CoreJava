package test.prog.system;

public class Java_Lang {

	public static void main(String[] args) {
		
		StringBuffer fR = new StringBuffer("Welcome");
		fR.append(" to the");
		fR.append(" Earth");
		
		System.out.println(fR);
		System.out.println("Length = "              + fR.length());
		System.out.println("Capacity = "            + fR.capacity());
		System.out.println("Character at 0 index = "+ fR.charAt(0));
		System.out.println("Index Of E = "          + fR.indexOf("E"));
		System.out.println("Last Index = "          + fR.lastIndexOf("h"));
		System.out.println("Replace = "             + fR.replace(0, 14, "WoW"));
		System.out.println("Reverse = "             + fR.reverse());
		
	}
}