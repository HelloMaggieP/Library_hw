import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Book book3;


    @Before
    public void Borrower(){
        borrower = new Borrower();
        book1 = new Book("H2G2", "Duglas Adams", "Sci-Fi");
        book2 = new Book("Casino Royale", "Ian Fleming", "Thriller");
        book3 = new Book("Angles and Demons", "Dan Brown", "Thriller");
    }

    @Test
    public void hasCollection(){
        assertEquals(0, borrower.getCollection());
    }
}
