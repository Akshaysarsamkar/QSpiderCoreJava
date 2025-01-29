package LoopingStatement.forloop;

public class FibonachiSeries {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;
		
		System.out.print("Fibinachi series is : " + num2 + " ");
		
		for(int i= 1 ; i<10;i++) {
			int num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;
		}

	}

}
