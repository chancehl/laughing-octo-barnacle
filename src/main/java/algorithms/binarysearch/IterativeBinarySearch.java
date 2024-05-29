package algorithms.binarysearch;

import java.util.Optional;

public class IterativeBinarySearch {
    public static Optional<Integer> search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return Optional.of(mid);
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return Optional.empty();
    }
}
