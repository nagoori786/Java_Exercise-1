import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomAndJerryTest {

    TomAndJerry tomAndJerry;
    @Before
    public void setUp() throws Exception {
        tomAndJerry=new TomAndJerry();
    }

    @After
    public void tearDown() throws Exception {
        tomAndJerry=null;
    }

    @Test
    public void tom() {
        String expected1 = "Tom";
        String actual1 = tomAndJerry.tomOrJerry(24);
        assertEquals(expected1, actual1);
    }

    @Test
    public void jerry() {
        String expected1 = "Jerry";
        String actual1 = tomAndJerry.tomOrJerry(21);
        assertEquals(expected1, actual1);
    }

    @Test
    public void tomAndJerryError() {
        String expected1 = "Not between 20 & 30";
        String actual1 = tomAndJerry.tomOrJerry(2123);
        assertEquals(expected1, actual1);
    }

}