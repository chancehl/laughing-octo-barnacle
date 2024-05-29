package problems.medium;

import utils.comparators.CountComparator;

import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = this.countElements(nums);

        PriorityQueue<Integer> queue = new PriorityQueue<>(new CountComparator(counts));

        queue.addAll(counts.keySet());

        int[] frequents = new int[k];
        int currentIndex = 0;

        while (currentIndex < k) {
            if (!queue.isEmpty()) {
                frequents[currentIndex] = queue.remove();
                currentIndex++;
            }
        }

        return frequents;
    }

    private Map<Integer, Integer> countElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                int current = map.get(num);
                map.put(num, current + 1);
            } else {
                map.put(num, 1);
            }
        }

        return map;
    }
}
