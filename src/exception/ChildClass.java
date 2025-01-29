package exception;

public class ChildClass extends ParentClass {

	public static void main(String[] args) {

		ParentClass parentClass = new ParentClass();

		ChildClass childClass = new ChildClass();

		childClass = (ChildClass) parentClass; // ClassCastException

	}

}
