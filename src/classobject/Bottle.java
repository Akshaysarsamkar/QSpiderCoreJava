package classobject;

public class Bottle {

	String name;
	String color;
	int price;
	float capacity;

	public static void main(String[] args) {

		Bottle b = new Bottle();
		System.out.println("Bottole name = " + (b.name = "pepsi"));
		System.out.println("Bottle color = " + (b.color = "Black"));
		System.out.println("Bottle price = " + (b.price = 45) + "RS");
		System.out.println("Bottle Capacity = " + (b.capacity = 4.5f) + "lit");

		System.out.println();

		Bottle b1 = new Bottle();
		System.out.println("Bottole name = " + (b1.name = "Bisleri"));
		System.out.println("Bottle color = " + (b1.color = "sky-blue"));
		System.out.println("Bottle price = " + (b1.price = 25) + "RS");
		System.out.println("Bottle Capacity = " + (b1.capacity = 1.5f) + "lit");

	}

}
