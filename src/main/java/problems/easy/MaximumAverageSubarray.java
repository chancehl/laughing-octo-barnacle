package problems.easy;

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int slow = 0;
        int fast = slow + k;

        double maxAverage = Double.NEGATIVE_INFINITY;

        while (slow < fast && fast <= nums.length) {
            double sum = 0;

            for (int i = slow; i < fast; i++) {
                sum += nums[i];
            }
            
            maxAverage = Math.max(maxAverage, sum / k);

            slow++;
            fast++;
        }

        return maxAverage;
    }
}
