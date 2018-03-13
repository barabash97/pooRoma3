
public class Overloading {
	public static void main(String[] argv) {
		int i = 127;
		i = ++i;
		
		System.out.println(i);
		//System.out.println(valore(testo));
	}
	
	public static String valore(int a) {
		return "intero";
	}
	
	public static String valore(String a) {
		return "stringa";
	}
	
	public static String valore(float a) {
		return "float";
	}
	
}
