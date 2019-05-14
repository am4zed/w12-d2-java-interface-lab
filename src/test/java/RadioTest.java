import Components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Philips", "TuneBoi");
    }

    @Test
    public void canTuneIn() {
        assertEquals("You are listening to Smooth Jamzzz",radio.tune("Smooth Jamzzz"));
    }
}

