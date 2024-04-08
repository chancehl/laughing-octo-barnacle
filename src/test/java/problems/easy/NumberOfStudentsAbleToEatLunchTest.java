package problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStudentsAbleToEatLunchTest {
    private static final NumberOfStudentsAbleToEatLunch solution = new NumberOfStudentsAbleToEatLunch();

    @Test
    void inputOne() {
        int result = solution.countStudents(new int[] {1,1,0,0}, new int[] {0,1,0,1});

        assertEquals(0, result);
    }
}