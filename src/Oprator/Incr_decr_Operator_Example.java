package Oprator;

public class Incr_decr_Operator_Example {

	public static void main(String[] args) {

		int a = 10;

		// post increment op (variable ++ )
		System.out.println("value of a " + a++); // 10

		// post decrement op (variable -- )
		System.out.println("value of a " + a--); // 11

		// pre increment op ( ++variable )
		System.out.println("value of a " + ++a); // 11

		// pre decrement op ( --variable )
		System.out.println("value of a " + --a); // 10

		// pre increment op ( ++variable )
		a = 10;
		System.out.println("value of a: " + ++a); // 11
		System.out.println(a);// 11

		// post increment op (variable ++ )
		a = 10;
		System.out.println("value of a : " + a++); // 10
		System.out.println(a); // 11

		// pre Decrement  op ( --variable )
		a = 10;
		System.out.println("value of a: " + --a); // 9
		System.out.println(a);// 9

		// post Decrement  op (variable -- )
		a = 10;
		System.out.println("value of a : " + a--); // 10
		System.out.println(a); // 9

	}

}
