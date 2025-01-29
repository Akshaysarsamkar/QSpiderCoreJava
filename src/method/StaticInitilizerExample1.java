package method;

public class StaticInitilizerExample1 {
	static int a = 78;  // 5 --> 54
	static {
		System.out.println("value of a is: " + a);
		a = 5;
	}
	// a = 98; not allow to reinitialize againg
	public static void main(String[] args) {

		System.out.println("Value of a is " + a);
		int a = 20;
		System.out.println("Value of a is : " + a);

	}
	static{
		m1();
		a = 54;
		System.out.println("Value of a is : " + a);
	}
	public static void m1() {
		System.out.println("Value of a is: " + a);
	}

}
//
//output : 
//	value of a is: 78
//	value of a is: 5
//	value of a is: 54
//	value of a is: 54
//	value of a is:20