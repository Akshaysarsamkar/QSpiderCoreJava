package method;

public class StaticInitilizerExample {

	static int a = 78;
	static String s = "hi";

	static {
		System.out.println(a); // 78
		System.out.println(s); // hi

		a = 45;
		s = "Hello";
	}

	public static void main(String[] args) {

		System.out.println(a); // 45
		System.out.println(s); // Hello
		a = 78;
		int a = 87;
		System.out.println(++a); // 87

	}

}
