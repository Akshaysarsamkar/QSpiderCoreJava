package LoopingStatement.whileloop;

public class SumOfNumberDigit {

	public static void main(String[] args) {

		int i = 864;
		int sum = 0;

		while (i > 0) {

			int rem = i % 10;
			sum = sum + rem;
			i = i / 10;

		}
		
		System.out.println("sum of number digit is " + sum );

	}

}
