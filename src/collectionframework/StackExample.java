package collectionframework;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();

		// add element
		stack.add(45);
		stack.add(71);
		stack.add(12);
		stack.add(32);
		System.out.println(stack);

		// Access first element
		System.out.println("First Index Element:=" + stack.firstElement());

		// Access Last element
		System.out.println("Last Index Element:=" + stack.lastElement());

		// access any index element
		System.out.println("element of 2 index:= " + stack.get(2));

		// iterate Stack
		for (int i : stack) {
			System.out.println(i);
		}
	}

}
