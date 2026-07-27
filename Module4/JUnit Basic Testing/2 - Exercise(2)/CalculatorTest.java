import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(10, c.add(4, 6));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, c.subtract(8, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, c.multiply(4, 5));
    }
}
