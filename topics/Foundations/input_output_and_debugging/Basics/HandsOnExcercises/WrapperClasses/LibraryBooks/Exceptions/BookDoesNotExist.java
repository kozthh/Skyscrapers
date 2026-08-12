package topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Exceptions;

public class BookDoesNotExist extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BookDoesNotExist(String message) {
        super(message);
    }
}
