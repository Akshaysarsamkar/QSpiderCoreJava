package opps.inheritance;

public class Vegetable {

	String vegetableName;
	String vegetableColor;
	float vegetablePrice;

	public Vegetable(String vegetableName, String vegetableColor, float vegetablePrice) {

		super(); // Super call Statement

		this.vegetableName = vegetableName;
		this.vegetableColor = vegetableColor;
		this.vegetablePrice = vegetablePrice;
	}

	public void vegetableDetails() {
		System.out.println("Vegetable Name is : " + vegetableName);
		System.out.println("Vegetable Color is : " + vegetableColor);
		System.out.println("Vegetable Price is : " + vegetablePrice);
	}

}
