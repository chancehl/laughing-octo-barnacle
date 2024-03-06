package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayTest {
    private static final MaximumAverageSubarray solution = new MaximumAverageSubarray();

    @Test
    void inputOne() {
        double actual = solution.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4);

        assertEquals(12.75, actual);
    }

    @Test
    void inputTwo() {
        double actual = solution.findMaxAverage(new int[] {5}, 1);

        assertEquals(5, actual);
    }

    @Test
    void inputThree() {
        double actual = solution.findMaxAverage(new int[] {-1}, 1);

        assertEquals(-1.0, actual);
    }
}