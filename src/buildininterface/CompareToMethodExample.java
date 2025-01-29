package buildininterface;

import java.util.Arrays;

class Student implements Comparable {

	int id;
	String name;
	float mathMark;
	float englishMark;

	public Student(int id, String name, float mathMark, float englishMark) {
		super();
		this.id = id;
		this.name = name;
		this.mathMark = mathMark;
		this.englishMark = englishMark;
	}

	@Override
	public int compareTo(Object o) {

		Student student = (Student) o;

		if (this.englishMark > student.englishMark) {
			return 1;
		} else if (this.englishMark < student.englishMark) {
			return -1;
		} else {
			return 0;
		}

	}

}

public class CompareToMethodExample {

	public static void main(String[] args) {

		Student s[] = new Student[5];

		s[0] = new Student(1, "Akshay", 78, 45);
		s[1] = new Student(7, "sam", 45, 85);
		s[2] = new Student(9, "raju", 89, 98);
		s[3] = new Student(2, "arman", 67, 75);
		s[4] = new Student(4, "joshef", 77, 65);

		Arrays.sort(s);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].englishMark);
		}

	}

}
