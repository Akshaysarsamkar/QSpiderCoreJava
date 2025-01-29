package LoopingStatement.forloop;

public class SumOfSquareOfNuturalNumber1To15 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 15; i++) {
			sum = sum + (i * i);
		}
		System.out.println("Sum is " + sum);
	}

}
