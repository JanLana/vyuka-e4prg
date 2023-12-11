
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import cz.gyarab.e4prg.s1.MyMin;


public class MyMinTest {
    @Test
    public void testPositive() {
        int out = MyMin.min(1, 2);
        assertEquals(1, out);
    }

    @Test
    public void testNegative() {
        int out = MyMin.min(-1, -2);
        assertEquals(-2, out);
    }

    public void nedelaNic() {

    }
}