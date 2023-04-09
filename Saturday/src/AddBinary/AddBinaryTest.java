package AddBinary;

import org.junit.Test;

import static AddBinary.AddBinary.addBinary;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddBinaryTest {

    @Test
    public void testBinaryAdditionWithZero() throws Exception {
        String first = "101";
        String second = "000";
        String expected = "0101";
        String result = addBinary(first, second);
        assertEquals(expected, result);
    }

    @Test
    public void testBinaryAdditionWithEqualLengths() throws Exception {
        String first = "1101";
        String second = "1011";
        String expected = "11000";
        String result = addBinary(first, second);
        assertEquals(expected, result);
    }

    @Test
    public void testBinaryAdditionWithUnequalLengths() throws Exception {
        String first = "1111";
        String second = "10";
        String expected = "010001";
        assertThrows(Exception.class, () -> addBinary(first, second));
    }

    @Test
    public void testBinaryAdditionWithCarry() throws Exception {
        String first = "1111";
        String second = "1111";
        String expected = "11110";
        String result = addBinary(first, second);
        assertEquals(expected, result);
    }

    @Test
    public void testBinaryAdditionWithSizeZero() throws Exception {
        String first = "";
        String second = "";
        assertThrows(Exception.class, () -> addBinary(first, second));
    }

    @Test
    public void testBinaryAdditionWithZeroAsResult() throws Exception {
        String first = "000";
        String second = "000";
        String expected = "0000";
        String result = addBinary(first, second);
        assertEquals(expected, result);
    }

}
