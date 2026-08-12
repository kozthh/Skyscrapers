package topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Books;

import topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Exceptions.BookDoesNotExist;
import topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Exceptions.BookNotAvailable;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books = new ArrayList<>();

    public Library() {
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, true));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960, true));
        books.add(new Book("1984", "George Orwell", 1948, true));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813, true));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951, true));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937, true));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, true));
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor() +
                    ", Year: " + book.getYear());
            System.out.println("---------");
        }
    }

    public void borrowBook(String title) {
        Book book = findBook(title);
        if (book == null) {
            throw new BookDoesNotExist("No book found with title: " + title);
        }
        if (!book.isAvailable()) {
            throw new BookNotAvailable("The book \"" + title + "\" is already borrowed.");
        }
        book.setAvailable(false);
        System.out.println("You have borrowed the book: " + title);
    }

    public void returnBook(String title) {
        Book book = findBook(title);
        if (book == null) {
            System.out.println("No book found with title: " + title);
            return;
        }
        if (book.isAvailable()) {
            System.out.println("This book was not borrowed: " + title);
            return;
        }
        book.setAvailable(true);
        System.out.println("You have returned the book: " + title);
    }

    private Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
