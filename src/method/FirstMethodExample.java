package method;

public class FirstMethodExample {

//  Main Method 	
	public static void main(String[] args) {
		System.out.println("StartMain method...............");

		Message(); // calleing method

		YourName();

		YourName(); // called one method multiple line

		System.out.println("End Main Method..............");

		// can't create method inside the main method
//    	public static  void add() {
//    		System.out.println("Method inside the main method.........");
//    	}
	}

	// class have n no of method
	public static void Message() { // called method
		System.out.println("Hi Hello Akshay How Are You");
	}

	// method created at class block
	public static void YourName() {
		System.out.println("My Name Is AkshayKumar Sarsamkar");
	}

	// not allow to create method inside method
//    public void MainMethod() {
//    	
//    	public void NestedMethod() {
//    		System.out.println("Nested method.......");
//    	}
//    }

}
