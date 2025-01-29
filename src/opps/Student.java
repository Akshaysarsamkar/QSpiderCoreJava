package opps;

/* 
 constructor chaining Example 
 */

public class Student {

	String studentName;
	int studentId;
	String studentAddress;

	public Student() {

	}

	public Student(String studentName) {
		this();
		this.studentName = studentName;
	}

	public Student(String studentName, int studentId) {
		this(studentName);
		this.studentId = studentId;
	}

	public Student(String studentName, int studentId, String studentAddress) {
		this(studentName, studentId);
		this.studentAddress = studentAddress;
	}

	public void showDetails() {
		System.out.println("Student Name is: " + studentName);
		System.out.println("Student Id is: " + studentId);
		System.out.println("Student Address is: " + studentAddress);
	}

}
