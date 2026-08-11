package Skycrapers.topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Exceptions;

public class BookDoesNotExist extends RuntimeException {
    public BookDoesNotExist(String message) {
        super("Book already borrowed: " + message);
    }
}
