import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


@RunWith(value = Parameterized.class)
public class RobotParamTest {

   private String expected;
   private int age;

    public RobotParamTest(String expected, int age){
        this.age = age;
        this.expected=expected;
    }

    @Parameterized.Parameters (name= "{index}: checkage({1})={0}")
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][] {
                {"Age ok", 10},
                {"Age ok" , 20},
                {"too old", 25},
        });
    }

    @Test
    public void testcheckageAll(){
        Robot Buddy = new Robot("buddy",age);
        assertEquals(expected, Buddy.checkage() );
    }


}