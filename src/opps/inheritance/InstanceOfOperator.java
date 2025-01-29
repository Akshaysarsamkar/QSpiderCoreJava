package opps.inheritance;

class A {

}

class B extends A {

}

class C extends A {

}

public class InstanceOfOperator {

	public static void main(String[] args) {

		B b = new B();

		System.out.println(b instanceof A);

		System.out.println(b instanceof B);

		//System.out.println(b instanceof C); // must have is-a relationship

	}

}
