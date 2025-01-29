package LoopingStatement.forloop;

public class FactorsOfNumber {

	public static void main(String[] args) {


		int num = 45;
		System.out.print(num + " factors = " );
		for(int i=1;i<=num;i++) {
			if(num%i == 0)
				System.out.print(i + " ");
		}

	}

}
