package exception;

public class ParseMethodExample {

	public static void main(String[] args) {

		String s = "45";  // only Number are Allowe in String Not Charater

		int i = Integer.parseInt(s);
		System.out.println(i);

		byte b = Byte.parseByte(s);
		System.out.println(b);

		long l = Long.parseLong(s);
		System.out.println(l);
		
		short s1 = Short.parseShort(s);
		System.out.println(s1);
		
		double d = Double.parseDouble(s);
		System.out.println(d);
		
		float f = Float.parseFloat(s);
		System.out.println(f);
		
		boolean bl  = Boolean.parseBoolean(s);
		System.out.println(bl);
	}

}
