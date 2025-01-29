package method;

public class StaticVariableExample {

	static int a;

	public static void main(String[] args) {

		System.out.println(a); // 0
		a = 7;
		m1();
		int a = 78;
		System.out.println(a); // 78

	}

	public static void m1() {

		System.out.println(a);
	}

}
