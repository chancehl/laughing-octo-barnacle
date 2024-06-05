package problems.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandOfStraightsTest {
    private static final HandOfStraights solution = new HandOfStraights();

    @Test
    void inputOne() {
        int[] hand = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;
        boolean expected = true;
        boolean actual = solution.isNStraightHand(hand, groupSize);
        assertEquals(expected, actual);
    }

    @Test
    void inputTwo() {
        int[] hand = {1,2,3,4,5};
        int groupSize = 4;
        boolean expected = false;
        boolean actual = solution.isNStraightHand(hand, groupSize);
        assertEquals(expected, actual);
    }

    @Test
    void inputThree() {
        int[] hand = {1,2,3,4,5,6};
        int groupSize = 2;
        boolean expected = true;
        boolean actual = solution.isNStraightHand(hand, groupSize);
        assertEquals(expected, actual);
    }

    @Test
    void inputFour() {
        int[] hand = {8,10,12};
        int groupSize = 3;
        boolean expected = false;
        boolean actual = solution.isNStraightHand(hand, groupSize);
        assertEquals(expected, actual);
    }

    @Test
    void inputFive() {
        int[] hand = {3,4,7,4,6,3,6,5,2,8};
        int groupSize = 2;
        boolean expected = false;
        boolean actual = solution.isNStraightHand(hand, groupSize);
        assertEquals(expected, actual);
    }
}