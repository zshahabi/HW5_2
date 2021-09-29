package model;

public abstract class Book {
    private String bookTitle;
    protected   double bookPrice;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }

    public abstract void setPrice();


}
