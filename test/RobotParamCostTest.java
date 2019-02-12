
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

    @RunWith(value = Parameterized.class)
    public class RobotParamCostTest {

        private double expected;
        private int age;



        public RobotParamCostTest( double expected, int age){
            this.age = age;
            this.expected = expected;
        }


        @Parameterized.Parameters (name= "{index}: checkage({1})={0}")
        public static Collection<Object[]> getTestParameters() {
            return Arrays.asList(new Object[][] {
                    {7500.0,10},
                    {5000.0,20},
                    {5000.0,25},
            });
        }


        @Test
        public void testCheckCost() {
            Robot buddy = new Robot("buddy",age);
            assertEquals(expected,buddy.checkCost(),0.0);

        }
    }




