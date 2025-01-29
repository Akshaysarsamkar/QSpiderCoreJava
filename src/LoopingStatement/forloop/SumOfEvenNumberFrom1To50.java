package LoopingStatement.forloop;

public class SumOfEvenNumberFrom1To50 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i <= 50; i+=2) {
				sum = sum + i;
		}
		System.out.println("Sum of all even number between 1 to 50 : " + sum);
	}

}
