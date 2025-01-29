package accessmodifiers;

public class DefalutModifier {

	int a = 45;

	void m1() {
		System.out.println("Default method");
	}

	public static void main(String[] args) {

		DefalutModifier defalutModifier = new DefalutModifier();
		System.out.println(defalutModifier.a);
		defalutModifier.m1();

	}

}
