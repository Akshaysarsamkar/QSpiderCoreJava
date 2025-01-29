package method;

public class GreetingMessage {

	public static void main(String[] args) {

		morningGreetingMessage();

		afterNoonGreetingMessage();

		evningGreetingMessage();

		nightGreetingMessage();

	}

	public static void afterNoonGreetingMessage() {
		System.out.println("Good Afternoon ");
	}

	public static void morningGreetingMessage() {
		System.out.println("Good Morning ");
	}

	public static void evningGreetingMessage() {
		System.out.println("Good Evening ");
	}

	public static void nightGreetingMessage() {
		System.out.println("Good Night ");
	}

}
