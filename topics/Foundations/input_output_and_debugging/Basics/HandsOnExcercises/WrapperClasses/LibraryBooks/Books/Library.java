package Skycrapers.topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Books;
import Skycrapers.topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Exceptions.BookDoesNotExist;

import java.util.ArrayList;
public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public Library() {
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, true));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960, true));
        books.add(new Book("1984", "George Orwell", 1948, true));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813, true));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951, true));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", 1937, true));
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, true));
    }

    public void getBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getBookTiTle() + ", Author: " + book.getBookAuthor() + ", Year: " + book.getBookYear() + "\n --------- \n");
        }
    }

    public void borrowBook(String title) {
        if(title == null || title.isEmpty()) {
            System.out.println("Invalid book title. \n");
        }
        else {
            try {
                for (Book book : books) {
                    if (book.getBookTiTle().equals(title) && book.getAvailability()) {
                        book.setAvailability(false);
                        System.out.println("You have borrowed the book: " + title + "\n");
                        return;
                    }
                    if (book.getBookTiTle().equals(title) && !book.getAvailability()) {
                        throw new BookDoesNotExist(title);
                    }
                }
            } catch (BookDoesNotExist e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getBookTiTle().equals(title) && !book.getAvailability()) {
                book.setAvailability(true);
                System.out.println("You have returned the book: " + title + "\n");
                return;
            }
            if  (book.getBookTiTle().equals(title) && book.getAvailability()) {
                System.out.println("This book was not borrowed: " + title + "\n");
                return;
            }
            }
    }
}