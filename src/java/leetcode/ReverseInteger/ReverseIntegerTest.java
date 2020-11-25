package leetcode.ReverseInteger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    Solution solution = new Solution();

    @Test
    void shouldReverseInteger() {
        assertEquals(321, solution.reverse(123));
        assertEquals(-321, solution.reverse(-123));
        assertEquals(0, solution.reverse(0));
    }

    @Test
    void shouldReturnZeroOnIncompatybibleInteger() {
        assertEquals(0, solution.reverse(1111111999));
    }

}
