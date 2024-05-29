package algorithms.binarysearch;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IterativeBinarySearchTest {
    @Test
    public void testSearchFound() {
        int[] nums = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 13;
        Optional<Integer> result = IterativeBinarySearch.search(nums, target);
        assertTrue(result.isPresent());
        assertEquals(6, (int) result.get());
    }

    @Test
    public void testSearchNotFound() {
        int[] nums = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 8;
        Optional<Integer> result = IterativeBinarySearch.search(nums, target);
        assertFalse(result.isPresent());
    }

    @Test
    public void testSearchEmptyArray() {
        int[] nums = {};
        int target = 5;
        Optional<Integer> result = IterativeBinarySearch.search(nums, target);
        assertFalse(result.isPresent());
    }

    @Test
    public void testSearchSingleElementArrayFound() {
        int[] nums = {10};
        int target = 10;
        Optional<Integer> result = IterativeBinarySearch.search(nums, target);
        assertTrue(result.isPresent());
        assertEquals(0, (int) result.get());
    }

    @Test
    public void testSearchSingleElementArrayNotFound() {
        int[] nums = {10};
        int target = 5;
        Optional<Integer> result = IterativeBinarySearch.search(nums, target);
        assertFalse(result.isPresent());
    }
}