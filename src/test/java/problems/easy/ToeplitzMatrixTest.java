package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ToeplitzMatrixTest {
    private final ToeplitzMatrix solution = new ToeplitzMatrix();

    @Test
    public void inputOne() {
        boolean actual = this.solution.isToeplitzMatrix(new int[][] {
            { 1,2,3,4 },
            { 5,1,2,3 },
            { 9,5,1,2 }
        });

        assertTrue(actual);
    }

    @Test
    public void inputTwo() {
        boolean actual = this.solution.isToeplitzMatrix(new int[][] {
                { 1,2 },
                { 2,2 }
        });

        assertFalse(actual);
    }

    @Test
    public void inputThree() {
        boolean actual = this.solution.isToeplitzMatrix(new int[][] {
                { 11,74,0,93 },
                { 40,11,74,7 }
        });

        assertFalse(actual);
    }

    @Test
    public void inputFour() {
        boolean actual = this.solution.isToeplitzMatrix(new int[][] {
                { 36,59,71,15,26,82,87 },
                { 56,36,59,71,15,26,82 },
                { 15,0,36,59,71,15,26 }
        });

        assertFalse(actual);
    }
}