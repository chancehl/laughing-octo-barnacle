package problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int index = 0;
        int start = nums[index];

        if (nums.length == 1 && start > 0) {
            return true;
        } else if (nums.length == 1 && start == 0) {
            return false;
        } else {
            List<int[]> subArrays = new ArrayList<>();

            while (start > 0) {
                subArrays.add(Arrays.copyOfRange(nums, index + start, nums.length));

                start--;
            }

            for (int[] subArray : subArrays) {
                return canJump(subArray);
            }

            return false;
        }
    }
}
