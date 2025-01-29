package classobject;

public class StaticInitializerExample {

	// non-static single line initializer
	int a = 20;

	// non-Static variable
	int b;

	// non-static multiline initializer
	{
		System.out.println("value of a is : " + a);
		System.out.println("Value of b is : " + b);
		b = 45;
		a = 89;
	}

	public static void main(String[] args) {
		StaticInitializerExample si = new StaticInitializerExample();
		si.details();
	}

	// non-static method
	public void details() {
		System.out.println("value of a is : " + a);
		System.out.println("Value of b is : " + b);

	}

}
