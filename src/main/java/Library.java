import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private Integer capacity;

    public Library(){
        this.stock = new ArrayList<>();
        this.capacity = 10;
    }

    public int getStock() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        this.stock.add(book);
    }

    public void removeBook() {
        this.stock.remove(0);
    }
}
