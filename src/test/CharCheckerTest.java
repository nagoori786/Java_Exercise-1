import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharCheckerTest{

    CharChecker charChecker;

    @Before
    public void setup () throws Exception {
        charChecker = new CharChecker();
    }

    @After
    public void tearDown () throws Exception {
        charChecker=null;
    }

    @Test
     public void charCheckerPositive() throws Exception {
        String expected1 = "Capital letter";
        String actual1 = charChecker.characterCheck('P');
        assertEquals(expected1, actual1);

        String expected2 = "Small letter";
        String actual2 = charChecker.characterCheck('a');
        assertEquals(expected2, actual2);

        String expected3 = "Digit";
        String actual3 = charChecker.characterCheck('7');
        assertEquals(expected3, actual3);

        String expected4 = "Special Character";
        String actual4 = charChecker.characterCheck(' ');
        assertEquals(expected4, actual4);


    }
}

