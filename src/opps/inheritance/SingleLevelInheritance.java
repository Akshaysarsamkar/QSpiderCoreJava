package opps.inheritance;

class Fruit {
	String season;
	String shapeType;

	public Fruit(String season, String shapeType) {

		this.season = season;
		this.shapeType = shapeType;

	}

}

class Apple extends Fruit {
	String fname;
	float price;
	String color;

	public Apple(String fname, float price, String color, String season, String shapeType) {
		super(season, shapeType);
		this.fname = fname;
		this.price = price;
		this.color = color;
	}

	public void showDetails() {
		System.out.println("Season Is : " + season);
		System.out.println("ShapeType : " + shapeType);
		System.out.println("Fruit Name = " + fname);
		System.out.println("Price is: " + price);
		System.out.println("Color is : " + price);
	}

}

public class SingleLevelInheritance {

	public static void main(String[] args) {

		Apple apple = new Apple("Apple", 100, "Red", "Rainy", "Circle");

		apple.showDetails();

	}

}
