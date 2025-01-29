package opps.inheritance;

public class Car {

	String cName;
	String cBrand;
	float cprice;
	Engine e;

	public Car(String cName, String cBrand, float cprice, Engine e) {
		super();
		this.cName = cName;
		this.cBrand = cBrand;
		this.cprice = cprice;

		// composite has a relationship car can't exit without the engine.............
		this.e = e;
	}

	public void carDetails() {
		System.out.println("Car name is: " + cName);
		System.out.println("Car Brand is: " + cBrand);
		System.out.println("Car price is " + cprice);
	}

}
