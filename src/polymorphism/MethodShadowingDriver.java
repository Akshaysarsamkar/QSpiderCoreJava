package polymorphism;

class ParentMethodShadowing {

	int i = 10;
	
	public static void msg() {
		System.out.println("Parent class method.................");
	}

	// not applicable for non static method
//	public void a() {
//		System.out.println("parent non static method");
//	}

}

class ChildMethodShadowing extends ParentMethodShadowing {

	int i = 78;
	public static void msg() {
		System.out.println("child class method.................");
	}

}

public class MethodShadowingDriver {

	public static void main(String[] args) {

		ChildMethodShadowing childMethodShadowing = new ChildMethodShadowing();
		childMethodShadowing.msg(); // child class method.................4
		System.out.println(childMethodShadowing.i);

		ParentMethodShadowing methodShadowing = new ParentMethodShadowing();
		methodShadowing.msg(); // Parent class method.................
		System.out.println(methodShadowing.i);

	}

}
