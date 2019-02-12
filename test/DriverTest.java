import org.junit.Test;

import static org.junit.Assert.*;

public class DriverTest {


    Driver firstDriver = new Driver ("Harry",145);



    @Test
    public void testDriverInstance() {
        assertEquals("Harry",firstDriver.getDriverName());
        assertEquals(145,firstDriver.getDriverNum());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDriverNameEmpty() {
        Driver secondDriver = new Driver ("",144);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDriverNumLessThan100() {
        Driver secondDriver = new Driver ("Leon",45);
    }


    @Test
    public void testToString() {
        String expected = "\nDriver Name: Harry\nDriver Number: 145";
        assertEquals(expected, firstDriver.toString());
    }

    @Test
    public void testcheck_status() {
        assertFalse(firstDriver.check_status());
    }


    @Test(timeout = 100) //milliseconds
    public void testwaittillbanned() {
        firstDriver.waitTillbanned();
    }
}