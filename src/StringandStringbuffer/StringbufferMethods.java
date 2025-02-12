package StringandStringbuffer;

public class StringbufferMethods {

	public static void main(String[] args) {


		StringBuffer s1 = new StringBuffer("Learn Core java");
		
		System.out.println(s1.capacity());
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(1));
		
		s1.append(" in Qspider");
		System.out.println(s1);
		
		s1.insert(20, "Kiran");
		System.out.println(s1);
		
		s1.delete(20, 24);
		System.out.println(s1);
		
		s1.deleteCharAt(0);
		System.out.println(s1);
		
		System.out.println(s1.reverse());
		
		s1.setLength(10);
		System.out.println(s1);
		
		System.out.println(s1.substring(1, 6));
		
		s1.replace(1, 5, "Akki");
		System.out.println(s1);
		
		s1.trimToSize();
		System.out.println(s1);

	}

}
