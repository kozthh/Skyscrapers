package Skycrapers.topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Main;
import Skycrapers.topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Books.Book;
import Skycrapers.topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Books.Library;
import Skycrapers.topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Exceptions.BookDoesNotExist;
import Skycrapers.topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Exceptions.BookNotAvailable;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library();
        boolean loop = true;

        do {
            System.out.print("Welcome to bookstore \n 1. Books available \n 2. Borrow a book \n 3. Return a book \n 4. Exit \n Enter your choice: ");
            String choice = input.nextLine();

            switch (choice) {

                case "1":
                    library.getBooks();
                    break;
                case "2":
                    System.out.print("Enter the title of the book you want to borrow: ");
                    String Titlebook = input.nextLine();
                    library.borrowBook(Titlebook);
                    break;
                case "3":
                    System.out.print("Enter the title of the book you want to return: ");
                    String returnTitle = input.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case "4":
                    System.out.println("Thank you for visiting the bookstore!");
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (loop);
    }

}