package method;

public class Demo2 {


	public static void main(String[] args) {

		areaOfCircle(4);
		areaOfRacTangle(12, 03);
	}

	public static void areaOfRacTangle(int l, int b) {
		System.out.println("Area of Tangle is " + (l + b) * 2);
	}

	public static void areaOfCircle(int radius) {

		System.out.println("Area Of circle is " + (radius * radius * 3.14));
	}

}
