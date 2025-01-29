package opps.inheritance;

public class Engine {

	String eBrand;
	String eColor;
	float price;

	public Engine(String eBrand, String eColor, float price) {
		this.eBrand = eBrand;
		this.eColor = eColor;
		this.price = price;
	}

	public void engineDetails() {
		System.out.println("Engine brand is: " + eBrand);
		System.out.println("Engine color is: " + eColor);
		System.out.println("Engine Price is: " + price);
	}

}
