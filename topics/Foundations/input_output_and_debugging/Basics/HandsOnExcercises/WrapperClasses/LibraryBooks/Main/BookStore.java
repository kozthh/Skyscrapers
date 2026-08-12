package topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Main;

import topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Books.Library;
import topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Exceptions.BookDoesNotExist;
import topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Exceptions.BookNotAvailable;

import java.util.Scanner;

public class BookStore {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Library library = new Library();
            boolean running = true;

            while (running) {
                System.out.println("Welcome to bookstore");
                System.out.println("1. Books available");
                System.out.println("2. Borrow a book");
                System.out.println("3. Return a book");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                switch (input.nextLine().trim()) {
                    case "1":
                        library.displayBooks();
                        break;
                    case "2":
                        System.out.print("Enter the title of the book you want to borrow: ");
                        try {
                            library.borrowBook(input.nextLine());
                        } catch (BookDoesNotExist | BookNotAvailable e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "3":
                        System.out.print("Enter the title of the book you want to return: ");
                        library.returnBook(input.nextLine());
                        break;
                    case "4":
                        System.out.println("Thank you for visiting the bookstore!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
