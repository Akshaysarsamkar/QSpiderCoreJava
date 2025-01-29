package basicprogram;
// Write a java program to store char type data(‘A’) inside the short and int type variable and print it
public class CharToShortAndInt {
	
	public static void main(String[] args) {
		
		char c = 'A';
		int i = c;
		short s = (short)c;
		
		System.out.println(s);
		System.out.println(i);
		
	}

}
