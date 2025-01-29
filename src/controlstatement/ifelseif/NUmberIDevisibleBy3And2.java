package controlstatement.ifelseif;

public class NUmberIDevisibleBy3And2 {

	public static void main(String[] args) {

		int num = 42;

		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("divisible by both 2 and 3");
		} else if (num % 2 == 0) {
			System.out.println("Divisible by only 2");
		} else if (num % 3 == 0) {
			System.out.println("divisible by only 3");
		}

	}

}
