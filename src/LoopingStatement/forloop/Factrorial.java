package LoopingStatement.forloop;

public class Factrorial {

	public static void main(String[] args) {

		int fact = 1;

		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
		}

		System.out.println("factorial of 5 is " + fact);

	}

}
