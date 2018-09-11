import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumCaluclatorTest {

    SumCaluclator sumCaluclator;

    @Before
    public void setUp() throws Exception {
        sumCaluclator = new SumCaluclator();
    }

    @After
    public void tearDown() throws Exception {
        sumCaluclator = null;
    }

    @Test
    public void sumPositive() {
        String str = "10 20 30";
        long actual = 60;
        long expected = sumCaluclator.sumCaluclate(str);
        assertEquals(expected, actual);
    }
    @Test
    public void sumNull() {
        String str1=" ";
        long actual1=0;
        long expected1=sumCaluclator.sumCaluclate(str1);
        assertEquals(expected1,actual1);
    }
}