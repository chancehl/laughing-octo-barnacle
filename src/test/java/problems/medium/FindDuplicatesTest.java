package problems.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicatesTest {
    private final FindDuplicates solution = new FindDuplicates();

    @Test
    void inputOne() {
        List<Integer> actual = this.solution.findDuplicates(new int[] {1,1,2});

        assertEquals(List.of(1), actual);
    }

    @Test
    void inputTwo() {
        List<Integer> actual = this.solution.findDuplicates(new int[]{4,3,2,7,8,2,3,1});

        assertEquals(List.of(2,3), actual);
    }
}