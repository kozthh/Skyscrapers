package Skycrapers.topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.WrapperClasses.LibraryBooks.Books;

public class Book {
    private String bookTiTle;
    private String bookAuthor;
    private int bookYear;
    public boolean availability;

    public Book(String bookTiTle, String bookAuthor, int bookYear, boolean availability) {
        this.bookTiTle = bookTiTle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.availability = availability;
    }

    public String getBookTiTle() {
        return bookTiTle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookYear() {
        return bookYear;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setBookTiTle(String bookTiTle) {
        this.bookTiTle = bookTiTle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
