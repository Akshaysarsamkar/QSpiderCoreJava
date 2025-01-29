package Oprator;

public class ArithmeticOperatoWithDiffrentDatatype {

	public static void main(String[] args) {
		
		int i = 10;
		float f = 10.45f;
		char c = 'a';
		short s = 110;
		byte b = 45;
		double d = 45.78;
		long l = 7854;
		
		
		// 1.	Double + float = double 
		System.out.println("( Double + float = double ) " + (d+f));

	
		
		//2.	Int + long = long 
		System.out.println("( Int + long = long ) " + (i + l));
		
		//3.	Char + byte = int 
		System.out.println("( Char + byte = int ) " + (c + b));
		
		//4.	Long + float = double 
		System.out.println("( Long + float = double ) " + (l + d));
	}

}
