package preprogramingM1.string;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String s = "Core Java";

		System.out.println("========================== length() ======================================");
		System.out.println(s.length());

		System.out.println("========================== (equals Operator) ======================================");
		String s2 = "java";
		String s3 = "Java";
		String s4 = new String("java");
		System.out.println(s2 == s3);
		System.out.println(s2 == s4);

		System.out.println("========================== (equals method) ======================================");
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));

		System.out.println(
				"========================== (equalsIgnoreCase() method) ======================================");
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s2.equalsIgnoreCase(s4));

		System.out.println("========================== (toUpperCase() method) ======================================");
		System.out.println(s2.toUpperCase());

		System.out.println("========================== (toLowerCase() method) ======================================");
		System.out.println(s2.toLowerCase());

		System.out.println("========================== (charAt() method) ======================================");
		System.out.println(s2.charAt(0));

		System.out.println("========================== (toCharArray() method) ======================================");
		char[] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));

		System.out.println(
				"========================== (subString(BeginIndex) method) ======================================");
		System.out.println(s.substring(5));

		System.out.println(
				"========================== (subString(BeginIndex,endIndex) method) ======================================");
		System.out.println(s.substring(2, 6));

		System.out.println("========================== (indexOf() method) ======================================");
		System.out.println(s.indexOf(' '));
		
		System.out.println("========================== (lastIndexOf() method) ======================================");
		System.out.println(s.lastIndexOf('a'));

	}

}
