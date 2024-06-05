package problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KClosestPointsToOriginTest {
    private static final KClosestPointsToOrigin solution = new KClosestPointsToOrigin();

    @Test
    void kClosest() {
        int[][] points = new int[][]{
                new int[]{3,3},
                new int[]{5,-1},
                new int[]{-2,4}
        };
        int k = 2;
        int[][] expected = new int[][]{
                new int[]{-2,4},
                new int[]{3,3}
        };
        int[][] actual = solution.kClosest(points, k);
        assertArrayEquals(expected, actual);
    }
}