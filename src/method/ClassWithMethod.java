package method;

public class ClassWithMethod {
	public static void main(String[] args) {


		System.out.println("Main Method Start ");
		add(45,78);
		System.out.println("Main Method Ends");

	}
	
	public static void add(int a, int b) {
		System.out.println("Addition of " + a + " + " +  b + " = " + (a+b));
	}

}
