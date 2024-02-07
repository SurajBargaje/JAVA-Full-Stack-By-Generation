import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestEvenOdd {
    EvenOdd even ;


@Test
    public void testEvenOdd1(){
        even = new EvenOdd();
        assertTrue("Even", even.evenOdd(3));
    }
}
