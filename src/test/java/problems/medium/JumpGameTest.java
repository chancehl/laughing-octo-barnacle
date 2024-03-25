package problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {
    private static final JumpGame solution = new JumpGame();

    @Test
    public void inputOne() {
        boolean actual = solution.canJump(new int[] {2,3,1,1,4});

        assertTrue(actual);
    }
}