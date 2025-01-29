package Oprator;

public class AssignmentOperator {

	public static void main(String[] args) {

		// ' = ' Equals to operator
		int a = 10;
		int b = 20;

		// ' += ' operator
		a += b; // a = a + b --------> 30
		System.out.println("Value of A is : " + a);

		// ' -= ' operator
		a -= b; // a = a - b ---------> 10
		System.out.println("Value of A is : " + a);

		// ' *= ' operator
		a *= b; // a = a * b ---------> 200
		System.out.println("Value of A is : " + a);

		// ' /= ' operator
		a /= b; // a = a / b ---------> 10
		System.out.println("Value of A is : " + a);

		// ' %= ' operator
		a %= b; // a = a % b ---------> 10
		System.out.println("Value of A is : " + a);

	}

}
