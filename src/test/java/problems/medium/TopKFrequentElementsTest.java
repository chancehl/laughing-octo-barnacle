package problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {
    private static final TopKFrequentElements solution = new TopKFrequentElements();

    @Test
    void topKFrequent() {
        int[] expected = new int[]{1,2};
        int[] actual = solution.topKFrequent(new int[]{1,1,1,2,2,3}, 2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void topKFrequent_Two() {
        int[] expected = new int[]{1,2};
        int[] actual = solution.topKFrequent(new int[]{1,3,2,1,1,2}, 2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void topKFrequent_Three() {
        int[] expected = new int[]{1};
        int[] actual = solution.topKFrequent(new int[]{1}, 1);

        assertArrayEquals(expected, actual);
    }

    @Test
    void topKFrequent_Four() {
        int[] expected = new int[]{-1,2};
        int[] actual = solution.topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2);

        assertArrayEquals(expected, actual);
    }
}