import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("H2G2", "Duglas Adams", "Sci-Fi");
        book2 = new Book("Casino Royale", "Ian Fleming", "Thriller");
        book3 = new Book("Angles and Demons", "Dan Brown", "Thriller");
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
        library.removeBook();
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
}
