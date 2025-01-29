package LoopingStatement.whileloop;

public class CountDigitInNumber {

	public static void main(String[] args) {


		int num = 789654;
		int count = 0;
		
		while(num > 0) {
			
			num /= 10;
			count++;
			
		}
		System.out.println("total Digit is " + count);

	}

}
