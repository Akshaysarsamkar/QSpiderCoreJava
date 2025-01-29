package method;

public class StaticInitializerExample2 {

	static int a = 78;

	static {

		int a = 5;
		System.out.println("Value of a is : " + a);
		System.out.println("Value of a is : " + StaticInitializerExample2.a);
		a = 90;
		// static int a = 78; not allow
	}

	public static void main(String[] args) {
		System.out.println("Main Method start");
		System.out.println("Main method End");
	}


	static {

		System.out.println("Value of a is: " + a);
		m1();
		System.out.println("Value of a os : " + a);
	}

	public static void m1() {
		a = 9999;
		System.out.println("value of a is : " + a);
	}

}

//output :
//	value of a is: 5 
//	value of a is: 78 
//	value of a is: 90
//	value of a is: 9999
//	value of a is: 9999
