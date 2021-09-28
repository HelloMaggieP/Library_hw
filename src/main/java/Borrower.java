import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int getCollection() {
        return this.collection.size();
    }

    public void borrowBook(Library library, Book book2) {
        if(this.collection.size() < 2) {
            Book borrowedBook = library.removeBook(book2);
            this.collection.add(borrowedBook);
        }
    }
}
