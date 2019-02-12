import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import static org.junit.Assert.*;

public class RobotPrivateTest {

    /**
     * Accessing a private member
     * Test of age member, of class Robot.
     */

    @Test
    public void testSetAge() throws Exception {
        System.out.println("testsetDriverNumber");
        Driver target = new Driver("Driver", 125);
        Class secretClass = target.getClass();

        /*Retrieve the name age */
        Field f = secretClass.getDeclaredField("Driver");

        /* make sure the field is accessible. */
        f.setAccessible(true);

        /* get the value of the field */
        System.out.println("The value in f (age) is " + f.get(target));

        int result =  f.getInt(target);
        assertEquals("The ages should be equal", 5,  result);
    }






    /**
     * Accessing a private member
     * Test of setAge method, of class robot.
     */

    @Test
    public void testSetDriverNumber() throws Exception {
        System.out.println("testSetDriverNum");

        Driver target = new Driver("Driver", 123);

        Method method = Driver.class.getDeclaredMethod("setDriverNum", int.class);

        /* make the method assessible */
        method.setAccessible(true);

        /* invoke the method setDriverNum with the value 6 */
        method.invoke(target, 156);

        /*access the field setDriverNum and check its value is set to 7*/
        Class secretClass = target.getClass();

        Field f = secretClass.getDeclaredField("driverNum");

        f.setAccessible(true);

        int result =  f.getInt(target);
        System.out.println("The value in f (driverNum) is " + f.get(target));
        assertEquals("The driver should be equal", 156,  result);
    }
}

