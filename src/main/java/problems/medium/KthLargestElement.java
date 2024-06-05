package problems.medium;

import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for (int num : nums) {
            priorityQueue.add(num);
        }

        int max = nums[0];

        while (k > 0 && !priorityQueue.isEmpty()) {
            max = priorityQueue.poll();

            k--;
        }

        return max;
    }
}
