import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Book book3;


    @Before
    public void Borrower(){
        borrower = new Borrower();
        library = new Library();
        book1 = new Book("H2G2", "Duglas Adams", "Sci-Fi");
        book2 = new Book("Casino Royale", "Ian Fleming", "Thriller");
        book3 = new Book("Angles and Demons", "Dan Brown", "Thriller");
    }

    @Test
    public void hasCollection(){
        assertEquals(0, borrower.getCollection());
    }

    @Test
    public void canBorrowBook(){
        library.addBook(book1);
        library.addBook(book2);
        borrower.borrowBook(library, book2);
        assertEquals(1, borrower.getCollection());
        assertEquals(1, library.getStock());
    }

    @Test
    public void canNotAddThreeBooks(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        borrower.borrowBook(library, book1);
        borrower.borrowBook(library, book2);
        borrower.borrowBook(library, book3);
        assertEquals(2, borrower.getCollection());
        assertEquals(1, library.getStock());
    }
}
