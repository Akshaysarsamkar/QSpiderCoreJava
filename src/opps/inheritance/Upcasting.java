package opps.inheritance;

class Parent {

	String parentName;
	int parentAge;

	public Parent(String parentName, int parentAge) {
		this.parentName = parentName;
		this.parentAge = parentAge;
	}

	public void getDetails() {
		System.out.println("Parent Name: " + this.parentName);
		System.out.println("Parent Age: " + this.parentAge);
	}

}

class Child extends Parent {

	String childName;
	int childAge;

	public Child(String childName, int childAge, String parentName, int parentAge) {
		super(parentName, parentAge);
		this.childName = childName;
		this.childAge = childAge;
	}

	public void getChildParentDetails() {
		System.out.println("Parent Name: " + this.parentName);
		System.out.println("Parent Age: " + this.parentAge);
		System.out.println("Child Name: " + this.childName);
		System.out.println("Child Age: " + this.childAge);
	}

}

public class Upcasting {

	public static void main(String[] args) {

		Child child = new Child("Akshay", 78, "Kumar", 98);
		child.getChildParentDetails();

		System.out.println();

		// Upcasting
		Parent parent = child; // not need to use typecasting Operator casting is automatically done by
								// compiler
		parent.getDetails();

		// not access the child class member after upcasting
		// parent.childAge;

	}

}
