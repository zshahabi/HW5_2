import model.Book;
import model.Fiction;
import model.NonFiction;

public class BookArray {
    public static void main(String[] args) {
        Book[] books=new Book[10];
        for (int i = 0; i < 10; i+=2) {
            books[i]=new Fiction("love");
            books[i+1]=new NonFiction("science");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(books[i].toString());
        }
    }
}
