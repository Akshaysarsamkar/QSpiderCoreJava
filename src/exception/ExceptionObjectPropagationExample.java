package exception;

public class ExceptionObjectPropagationExample {

	// Calling Method
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			System.out.println("Exception Handle in Calling Method");
		}
	}

	// Called Method
	private static void m1() {

		System.out.println(10 / 0);

	}

}
