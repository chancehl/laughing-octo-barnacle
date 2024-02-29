package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingDigitSumTest {
    private static final AlternatingDigitSum solution = new AlternatingDigitSum();

    @Test
    public void inputOne() {
        assertEquals(solution.alternateDigitSum(521), 4);
    }

    @Test
    public void inputTwo() {
        assertEquals(solution.alternateDigitSum(111), 1);
    }

    @Test
    public void inputThree() {
        assertEquals(solution.alternateDigitSum(886996), 0);
    }
}