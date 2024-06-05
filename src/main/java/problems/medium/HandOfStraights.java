package problems.medium;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Complexity: O(n log n)
 */
public class HandOfStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if ((hand.length % groupSize) != 0) {
            return false;
        }

        HashMap<Integer, Integer> cardMap = this.countCards(hand);
        PriorityQueue<Integer> priorityQueue = this.createPriorityQueue(hand);

        while (!priorityQueue.isEmpty()) {
            int start = priorityQueue.poll();

            if (!cardMap.containsKey(start)) {
                return false;
            }

            if (cardMap.get(start) == 0) {
                continue;
            }

            for (int i = start; i < (start + groupSize); i++) {
                if (!cardMap.containsKey(i) || cardMap.get(i) == 0) {
                    return false;
                } else {
                    int count = cardMap.get(i);

                    cardMap.put(i, count - 1);
                }
            }
        }

        return true;
    }

    public PriorityQueue<Integer> createPriorityQueue(int[] hand) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int card : hand) {
            queue.add(card);
        }

        return queue;
    }

    public HashMap<Integer, Integer> countCards(int[] hand) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int card : hand) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        return map;
    }
}
