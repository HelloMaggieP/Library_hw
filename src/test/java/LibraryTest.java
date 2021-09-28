import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("H2G2", "Duglas Adams", "Sci-Fi");
        book2 = new Book("Casino Royale", "Ian Fleming", "Thriller");
        book3 = new Book("Angles and Demons", "Dan Brown", "Thriller");
        book4 = new Book("Angles and Demons", "Dan Brown", "Crime");
    }

    @Test
    public void canGetStock(){
        assertEquals(0, library.getStock());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.getStock());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book2);
        assertEquals(1, library.getStock());
    }

    @Test
    public void cantAddBookIfCapacityIsMax(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(5, library.getStock());
    }

    @Test
    public void testHashMap(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.createHashMap();
        assertEquals(true, library.getBookGenre().containsKey("Thriller"));
    }

    @Test
    public void getHashMapValue(){
        library.addBook(book3);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.createHashMap();
        assertEquals(3, library.getHashMapValue("Thriller"));
    }

    @Test
    public void addGemreToHashMap(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book4);
        library.createHashMap();
        assertEquals(1, library.getHashMapValue("Crime"));
    }

    @Test
    public void addGemreValueToHashMap(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book4);
        library.addBook(book4);
        library.createHashMap();
        assertEquals(2, library.getHashMapValue("Crime"));
    }
}
