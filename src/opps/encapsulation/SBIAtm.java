package opps.encapsulation;

public class SBIAtm {

	public static void main(String[] args) {

		ICICICard card = new ICICICard();

		System.out.println(card.getAccountBalance(1234) + "available balance......");
		System.out.println();

		card.setAccountBalance(560, 1234);
		System.out.println();

		System.out.println(card.getAccountBalance(1234) + "available balance......");

	}

}
