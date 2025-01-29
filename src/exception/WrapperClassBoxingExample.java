package exception;

public class WrapperClassBoxingExample {

	public static void main(String[] args) {

		int a = 12;
		Integer integer = Integer.valueOf(a);
		System.out.println(a + " " + integer);
		System.out.println(integer.getClass());

		byte b = 78;
		Byte bb = Byte.valueOf(b);
		System.out.println(b + " " + bb);
		System.out.println(bb.getClass());

		char c = 'a';
		Character cc = Character.valueOf(c);
		System.out.println(c + "  " + cc);
		System.out.println(cc.getClass());

		short s = 4;
		Short ss = Short.valueOf(s);
		System.out.println(s + "  " + ss);
		System.out.println(ss.getClass());

		double d = 1.2d;
		Double dd = Double.valueOf(d);
		System.out.println(d + " " + dd);
		System.out.println(dd.getClass());

		float f = 45.4f;
		Float ff = Float.valueOf(f);
		System.out.println(f + " " + ff);
		System.out.println(ff.getClass());

		long l = 89;
		Long ll = Long.valueOf(l);
		System.out.println(l + " " + ll);
		System.out.println(ll.getClass());

		System.out.println();
		// After the version 5.0

		Integer iii = a;
		System.out.println(iii.getClass() + " value " + iii);

		Long lll = l;
		System.out.println(lll.getClass() + " value " + lll);

		Double ddd = d;
		System.out.println(ddd.getClass() + " value " + ddd);

		Float fff = f;
		System.out.println(fff.getClass() + " value " + fff);

	}

}
