
package preprogramingM1.string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {

		String s = "  learn_java";

		System.out.println(s.toUpperCase());

		System.out.println(s.toLowerCase());

		System.out.println(s.concat("_with_Akshay"));

		System.out.println(s.trim());

		System.out.println(s.substring(3));

		System.out.println(s.substring(1, 5));

		System.out.println(s.charAt(2));

		System.out.println(s.lastIndexOf('a'));

		System.out.println(s.indexOf("java"));

		System.out.println(s.length());

		System.out.println("Akshay".equals("akshay"));

		System.out.println("Akshay".equalsIgnoreCase("akshay"));

		System.out.println(s.contains("java"));

		char[] c = s.toCharArray();
		System.out.println(Arrays.toString(c));

		String s1[] = s.split("_");
		System.out.println(Arrays.toString(s1));

	}

}
