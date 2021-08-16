import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {
    @Test
    public void initializeCard() {
        Card card = new Card();

        assertNotNull(card);
    }

    
}