import Components.CassetteDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CassetteDeck cassetteDeck;

    @Before
    public void before(){
        stereo = new Stereo("MyStereo");
        cassetteDeck = new CassetteDeck("Sony", "SupaTape3000");
    }

    @Test
    public void hasName() {
        assertEquals("MyStereo", stereo.getName());
    }

    @Test
    public void canAddComponentCassetteDeck() {
        stereo.addComponent(cassetteDeck);
        assertEquals(1, stereo.countComponents());
    }
}
