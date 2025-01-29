package method;

public class StaticMethodWithArguments {

	public static void main(String[] args) {

		System.out.println("Main Method Start");

		name("Akshay");

		System.out.println("Main Method End");

	}

	public static void name(String name) {

		System.out.println("my name is : " + name);

	}

}
