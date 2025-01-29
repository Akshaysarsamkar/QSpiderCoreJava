package preprogramingM1.string;

public class StringDemo {

	public static void main(String[] args) {

		String s = "Akshay";
		String s1 = "akshay";
		String s3 = "Akshay";
		String s4 = new String("Akshay");
		String s5 = s4;

		// equals method
		System.out.println(s.equals(s1)); // false
		System.out.println(s.equals(s3)); // true
		System.out.println(s.equals(s4)); // true
		System.out.println(s.equals(s5)); // true
		System.out.println(s3.equals(s4)); // true

		System.out.println();
		// hashcode
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
	}

}
