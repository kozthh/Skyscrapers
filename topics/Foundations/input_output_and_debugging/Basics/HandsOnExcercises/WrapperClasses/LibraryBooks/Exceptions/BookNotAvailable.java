package topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Exceptions;

public class BookNotAvailable extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BookNotAvailable(String message) {
        super(message);
    }
}
