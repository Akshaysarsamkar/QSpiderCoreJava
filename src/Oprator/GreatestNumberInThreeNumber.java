package Oprator;

public class GreatestNumberInThreeNumber {

	public static void main(String[] args) {

		int a = 10;
		int b = 45;
		int c = 65;

		int res = (a > b) && (a > c) ? a : (b > c) ? b : c;
		System.out.println(res + " is greatest number among three");  // 65

		a = 10;
		b = 45;
		c = 5;

		int res1 = (a > b) && (a > c) ? a : (b > c) ? b : c;
		System.out.println(res1 + " is greatest number among three"); //45
 
		a = 10;
		b = 4;
		c = 5;

		int res3 = (a > b) && (a > c) ? a : (b > c) ? b : c;
		System.out.println(res3 + " is greatest number among three"); // 10

	}

}
