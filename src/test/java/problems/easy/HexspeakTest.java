package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HexspeakTest {
    private static final Hexspeak solution = new Hexspeak();

    @Test
    public void inputOne() {
        assertEquals(solution.toHexspeak("257"), "IOI");
    }

    @Test
    public void inputTwo() {
        assertEquals(solution.toHexspeak("3"), "ERROR");
    }

    @Test
    public void inputThree() {
        assertEquals(solution.toHexspeak("619879596177"), "ERROR");
    }

    @Test
    public void inputFour() {
        assertEquals(solution.toHexspeak("747823223228"), "AEIDBCDIBC");
    }
}