package opps.encapsulation;

import java.util.Scanner;

public class LibraryDriver {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean exit = true;
		Library library = new Library();
		Book book = null;

		while (exit) {

			System.out.println("Choice the operation");
			System.out.println("1]Add Book");
			System.out.println("2]Remove Book");
			System.out.println("3]View Books Details");
			System.out.println("4] Exit");

			int ch = scanner.nextInt();

			switch (ch) {

			case 1:
				book = new Book();
				System.out.println("Enter the Book Id");
				int id = scanner.nextInt();
				book.setBookId(id);

				System.out.println("Enter the Book Name");
				String bname = scanner.next();
				book.setBookName(bname);

				System.out.println("Enter the price of book");
				float price = scanner.nextFloat();
				book.setPrice(price);

				library.addBook(book);

				break;

			case 2:
				book = new Book();
				System.out.println("Enter the Book Id");
				int id1 = scanner.nextInt();
				book.setBookId(id1);

//				System.out.println("Enter the Book Name");
//				String bname1 = scanner.next();
//				book.setBookName(bname1);
//
//				System.out.println("Enter the price of book");
//				float price1 = scanner.nextFloat();
//				book.setPrice(price1);

				library.removeBook(id1);

				break;

			case 3:
				library.showBookDetails();
				break;

			case 4:
				System.out.println("Your succesfully Logout.............");
				exit = false;
				break;

			default:
				System.out.println("Enter correct choice");

			}

		}

	}

}
