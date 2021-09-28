import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private Integer capacity;

    public Library(){
        this.stock = new ArrayList<>();
        this.capacity = 5;
    }

    public int getStock() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.stock.size() < this.capacity)
            this.stock.add(book);
    }

    public void removeBook() {
        this.stock.remove(0);
    }
}
