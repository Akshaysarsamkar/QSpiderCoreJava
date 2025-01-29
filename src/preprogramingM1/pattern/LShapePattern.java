package preprogramingM1.pattern;

public class LShapePattern {

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * * * * * *
	 */

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (i == 5 || j == 0) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
