package exception;

public class WrapperClassUnboxingExample {

	public static void main(String[] args) {

		Integer integer = 45;
		int i = integer.intValue();
		System.out.println(i);

		Float ff = 78.45f;
		float f = ff.floatValue();
		System.out.println(f);

		Double double1 = 78.45;
		double d = double1.doubleValue();
		System.out.println(d);

		Character character = 'g';
		Character c = character.charValue();
		System.out.println(c);

		Short short1 = 78;
		short s = short1.shortValue();
		System.out.println(s);

		Long long1 = 7854l;
		long l = long1.longValue();
		System.out.println(l);

		Byte byte1 = 78;
		byte b = byte1.byteValue();
		System.out.println(b);

		System.out.println();
		// after 5.0

		int ii = integer;
		System.out.println(ii);

		float fff = ff;
		System.out.println(ff);

		double ddd = double1;
		System.out.println(ddd);

	}

}
