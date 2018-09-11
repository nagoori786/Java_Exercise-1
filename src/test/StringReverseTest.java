import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    StringReverse stringReverse;
    @Before
    public void setUp() throws Exception {
        stringReverse=new StringReverse();
    }

    @After
    public void tearDown() throws Exception {
        stringReverse=null;
    }

    @Test
    public void reverseStringCheck() {
        String actual="utsad";
        String expected=stringReverse.reverseString("dastu");
        assertEquals(expected,actual);
    }

    @Test
    public void reverseStringNull() {
        String actual=" ";
        String expected=stringReverse.reverseString(" ");
        assertEquals(expected,actual);
    }
}