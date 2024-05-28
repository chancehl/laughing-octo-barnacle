package algorithms;

import java.util.Optional;

public class BinarySearch {
    public static Optional<Integer> search(int[] nums, int target) {
        return BinarySearch.searchRecursively(nums, target, 0, nums.length - 1);
    }

    private static Optional<Integer> searchRecursively(int[] nums, int target, int left, int right) {
        if (left > right) {
            return Optional.empty();
        }

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return Optional.of(mid);
        } else if (nums[mid] > target) {
            return BinarySearch.searchRecursively(nums, target, left, mid - 1);
        } else {
            return BinarySearch.searchRecursively(nums, target, mid + 1, right);
        }
    }
}
