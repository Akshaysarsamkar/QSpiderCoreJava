package interfaceexample;

interface MemberAccessInInterface {

	// by default all member are public
	// static int a; not allow
	static final int b = 45;

	public static void staticMethod() {
		System.out.println("Static method");
	}

	abstract void nonStaticMethod();

}

public class Demo implements MemberAccessInInterface {

	@Override
	public void nonStaticMethod() {

		System.out.println("Non-static abstract method...........");

	}

	public static void main(String[] args) {

		Demo demo = new Demo();
		demo.nonStaticMethod();

		MemberAccessInInterface.staticMethod();

		// demo.staticmethod() not allow
	}

}
