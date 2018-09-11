import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    PalindromeChecker palindromeChecker;

    @Before
    public void setUp() throws Exception {
        palindromeChecker=new PalindromeChecker();
    }

    @After
    public void tearDown() throws Exception {
        palindromeChecker=null;
    }

    @Test
    public void palindromeCheckPositive()throws Exception{
        boolean actual=palindromeChecker.palindromeCheck(12321);
        assertTrue(actual);

        boolean actual1=palindromeChecker.palindromeCheck(1111111);
        assertTrue(actual1);

    }

    @Test
    public void palindromeCheckNegative()throws Exception{
        boolean actual=palindromeChecker.palindromeCheck(123217);
        assertFalse(actual);

        boolean actual1=palindromeChecker.palindromeCheck(12);
        assertFalse(actual1);

    }
}