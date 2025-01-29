package controlstatement.ifelseif;

public class IncomeTaxLevel {

	public static void main(String[] args) {

		int income = 245000;

		if (income <= 250000) {
			System.out.println("No need to pay tax");
		} else if (income > 250000 && income <= 500000) {
			System.out.println("need to pay 5% tax");
		}else if(income > 500000 && income < 1000000) {
			System.out.println("need to pay 20% tax");
		}else {
			System.out.println("Need to pay 30% tax");
		}
	}

}
