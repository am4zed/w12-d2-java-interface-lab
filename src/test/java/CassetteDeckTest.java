import Components.CassetteDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CassetteDeckTest {

    CassetteDeck cassetteDeck;

    @Before
    public void before(){
        cassetteDeck = new CassetteDeck("Sony", "SupaTape3000");
    }

    @Test
    public void canAddTape() {
        cassetteDeck.addMedia("Queen Greatest Hits");
        assertEquals("Queen Greatest Hits", cassetteDeck.checkTape());
    }
}
