import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        book1 = new Book("H2G2", "Duglas Adams", "Sci-Fi");
        book2 = new Book("Casino Royale", "Ian Fleming", "Thriller");
        book3 = new Book("Angles and Demons", "Dan Brown", "Thriller");
    }

    @Test
    public void hasTitle(){
        assertEquals("H2G2", book1.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Duglas Adams", book1.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Sci-Fi", book1.getGenre());
    }
}
