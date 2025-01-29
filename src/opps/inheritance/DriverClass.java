package opps.inheritance;

class Tomato extends Vegetable {

	public Tomato(String vegetableName, String vegetableColor, float vegetablePrice) {

		// System.out.println("Constructor of parent class"); // not allow through CTE

		super(vegetableName, vegetableColor, vegetablePrice); // passed data to parent constructor and always first
																// instruction in constructor block

	}

}

public class DriverClass {

	public static void main(String[] args) {

		Tomato tomato = new Tomato("Cherry-Tomato", "Red", 50f);
		tomato.vegetableDetails();

	}

}
