package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeStringGreatTest {
    private final MakeStringGreat solution = new MakeStringGreat();

    @Test
    void inputOne() {
        assertEquals("", solution.makeGood("abBAcC"));
        assertEquals("", solution.makeGoodOptimized("abBAcC"));
    }

    @Test
    void inputTwo() {
        assertEquals("leetcode", solution.makeGood("leEeetcode"));
        assertEquals("leetcode", solution.makeGoodOptimized("leEeetcode"));
    }

    @Test
    void inputThree() {
        assertEquals("s", solution.makeGood("s"));
        assertEquals("s", solution.makeGoodOptimized("s"));
    }
}