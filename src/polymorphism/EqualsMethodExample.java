package polymorphism;

class Mobile {

	String mobileName;
	String mobileModel;
	float price;

	public Mobile(String mobileName, String mobileModel, float price) {
		super();
		this.mobileName = mobileName;
		this.mobileModel = mobileModel;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {

		Mobile m1 = (Mobile) obj;
		return this.mobileName == m1.mobileName && this.mobileModel == m1.mobileModel && this.price == m1.price;
	}

}

public class EqualsMethodExample {

	public static void main(String[] args) {

		Mobile mobile = new Mobile("POCO_M2_Pro", "MI", 13500f);
		Mobile mobile1 = mobile;
		Mobile mobile2 = new Mobile("POCO_M2_Pro", "MI", 13500f);

		System.out.println(mobile.equals(mobile1));
		System.out.println(mobile.equals(mobile2));


		System.out.println(mobile == mobile1);
		System.out.println(mobile == mobile2);

	}

}
