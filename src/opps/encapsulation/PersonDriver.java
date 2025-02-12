package opps.encapsulation;

import java.util.Scanner;

public class PersonDriver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Person person = new Person();
		
		System.out.println("Enter the person name");
		String name = scanner.next();
		
		System.out.println("Enter the person age ");
		int age = scanner.nextInt();
		
		System.out.println("Enter the mail");
		String mail = scanner.next();
		
		person.setAge(age);
		person.setEmail(mail);
		person.setName(name);
		
		

	}

}
