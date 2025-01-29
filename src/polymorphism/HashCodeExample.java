package polymorphism;

class Demo {
	int a = 45;

	public void m1() {
		System.out.println("Value of a is : " + a);
	}
}

public class HashCodeExample {

	public static void main(String[] args) {
		Demo demo1 = new Demo();

		Demo demo2 = new Demo();

		Demo demo3 = demo1;

		Demo demo4 = demo3;

		System.out.println(demo1.hashCode());
		System.out.println(demo2.hashCode());
		System.out.println(demo3.hashCode());
		System.out.println(demo4.hashCode());

		System.out.println(demo1.equals(demo4)); // if the hashcode is same the equals method return true
		System.out.println(demo2.equals(demo4)); // if haashcode is different then equals method return false

	}

}
