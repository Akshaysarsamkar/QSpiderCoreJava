package classobject;
//Question: Design a Student class with attributes name, age, grades (a list of grades). Write a method to calculate the average grade.

class Student {
	String name;
	int age;
	int gread[];

	public Student(String name, int age, int[] gread) {
		super();
		this.name = name;
		this.age = age;
		this.gread = gread;
	}

	public void AvgGread() {
		int sum = 0;
		for (int i = 0; i < this.gread.length; i++) {
			sum = sum + this.gread[i];
		}
		System.out.println("Average Of gread is : " + (sum / this.gread.length));
	}

}

public class Quation2 {

	public static void main(String[] args) {

		int a[] = { 45, 45,45 };
		Student s1 = new Student("Akshay", 45, a);
		s1.AvgGread();

	}

}
