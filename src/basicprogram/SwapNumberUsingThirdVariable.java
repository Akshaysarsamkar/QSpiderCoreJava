package basicprogram;

public class SwapNumberUsingThirdVariable {

	public static void main(String[] args) {

		int a = 10;
		int b = 50;
		int c;
		System.out.println("Before Swaping A : " + a + " B: " + b);

		c = a;
		a = b;
		b = c;

		System.out.println("After Swaping A : " + a + " B: " + b);

	}

}
