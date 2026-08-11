package Skycrapers.topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Exceptions;

public class BookNotAvailable extends RuntimeException {
    public BookNotAvailable(String message) {
        super(message);
    }
}
