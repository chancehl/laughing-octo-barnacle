package algorithms.binarysearch;

import java.util.Optional;

public class RecursiveBinarySearch {
    public static Optional<Integer> search(int[] nums, int target) {
        return RecursiveBinarySearch.search(nums, target, 0, nums.length - 1);
    }

    private static Optional<Integer> search(int[] nums, int target, int left, int right) {
        if (left > right) {
            return Optional.empty();
        }

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return Optional.of(mid);
        } else if (nums[mid] > target) {
            return RecursiveBinarySearch.search(nums, target, left, mid - 1);
        } else {
            return RecursiveBinarySearch.search(nums, target, mid + 1, right);
        }
    }
}
