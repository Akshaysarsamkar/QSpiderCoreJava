package variable;

public class LocalVariableEx1 {
	
	public static void main(String[] args) {
		
		// not allow
//		int b;
//		System.out.println(b);
//		
		
		
		int a ;
		{
			a = 10;
			System.out.println(a);
		}
		
		{
			int x;
		}
	
		// not allow
//		x=10;
//		System.out.println(x);
	}

}
