package test.prog.system;

public class Java_Lang_01 {

	public static void main(String[] args) {
		
		String str = "We are Learning Java";
		
		System.out.println("Length = "                + str.length());
		System.out.println("Character at 7th index = "+ str.charAt(7));
		System.out.println("J's Index is = "          + str.indexOf('J'));
		System.out.println("'a' is at Index = "       + str.indexOf('a'));
		System.out.println("'a's last Index = "       + str.lastIndexOf('a'));
		System.out.println("Lower case = "            + str.toLowerCase());
		System.out.println("Upper Case = "            + str.toUpperCase());
		System.out.println("Starts with We = "        + str.startsWith("We"));
		System.out.println("Ends with Java = "        + str.endsWith("Java"));
		System.out.println("Substring = "             + str.substring(7));
		System.out.println("Replace a with K = "      + str.replace('a', 'K'));
		//Print Reverse String method is not available in Normal String(Only in BufferString)
		//.Capacity method is not available for Normal String 
	}
}
