package basicprogram;

public class SwapWithOutThirdVariable {

	public static void main(String[] args) {

		int a = 50;
		int b = 60;

		System.out.println("Before Swaping A : " + a + " B: " + b);

		a = a + b; // 110=50+60
		b = a - b; // 50=110-60
		a = a - b; // 60=110-50

		System.out.println("After Swaping A : " + a + " B: " + b);

	}

}
