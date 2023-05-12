
public class BufferTest1 {

	public static void main(String[] args) {
		
		String s = "My";
		String s1 = "My";
		
		StringBuffer er = new StringBuffer("My name");
		StringBuffer df = new StringBuffer("My name");
		
		if(er == df) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
