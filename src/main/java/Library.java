import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> stock;
    private Integer capacity;
    private HashMap<String, Integer> bookGenre;

    public Library(){
        this.stock = new ArrayList<>();
        this.capacity = 5;
        this.bookGenre = new HashMap<>();
    }

    public int getStock() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.stock.size() < this.capacity)
            this.stock.add(book);
    }

    public Book removeBook(Book book) {
        return this.stock.remove(this.stock.indexOf(book));
    }

    public void createHashMap(){
        for (Book book : this.stock){
            String key = book.getGenre();
            if(this.bookGenre.containsKey(key)){
                int total = this.bookGenre.get(key);
                this.bookGenre.put(key, total+1);
            }else {
                this.bookGenre.put(key, 1);
            }
        }
    }

    public HashMap<String, Integer> getBookGenre() {
        return bookGenre;
    }

    public int getHashMapValue(String key) {
        return this.bookGenre.get(key);
    }
}
