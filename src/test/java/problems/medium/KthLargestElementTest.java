package problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementTest {
    private static final KthLargestElement solution = new KthLargestElement();

    @Test
    void findKthLargest() {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int expected = 5;
        int actual = solution.findKthLargest(nums, k);
        assertEquals(expected, actual);
    }
}