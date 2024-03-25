package problems.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Complexity: O(N) time, O(1) space
 *
 * Note: This problem stated that your solution must run in O(N) time and O(1) space.
 * Note: This problem stated that all values would be between 1 and N where N is the length of the array.
 *
 * So this uses a nifty little trick that I would not have been able to come up with without some help.
 * Essentially, in order to meet the O(1) extra space constraint, you can use the input array itself as
 * a source of truth for whether a value has been seen. When you encounter a value, you flip the sign (negate)
 * at nums[value - 1]. Then, when you encounter a negative value at that index in the future, you know you've already
 * seen this value.
 *
 * Reference: <a href="https://www.youtube.com/watch?v=Y8x0iAVEITo">NeetcodeIO</a>
 */
public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int value = Math.abs(nums[i]);

            int key = value - 1; // keys are always 0 indexed and represent the value stored at the N-1th position

            if (nums[key] < 0) {
                duplicates.add(value);
            }

            nums[key] = Math.negateExact(nums[key]);
        }

        return duplicates;
    }
}
