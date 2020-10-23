package main.java.SubtracttheProductandSumofDigitsofanInteger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void shouldReturnDifferenceOfProductAndSum() {
        Solution solution = new Solution();
        assertEquals(15, solution.subtractProductAndSum(234));
        assertEquals(21, solution.subtractProductAndSum(4421));
        assertEquals(0, solution.subtractProductAndSum(1));
    }
}
