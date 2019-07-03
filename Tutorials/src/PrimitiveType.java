
public class PrimitiveType {

	public static void main(String[] args) {
		boolean isPizzaDelicious = true;
		byte b = 'C';
		char c = 'Z';
		short s = -32768;
		int i = 87328; //max size is 32 bits
		long l = 283990; //max size is 64 bits
		
		float f = 20.5f; //max size is 32 bits , smaller
		double d = 20.5; //max size is 64 bits , bigger
		
		double h = d / s;
		System.out.println(h);

	}

}


//boolean, byte, char, short, int, long, float and double