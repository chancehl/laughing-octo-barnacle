package problems.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> Double.compare(this.computeDistanceFromOrigin(a), this.computeDistanceFromOrigin(b)));

        priorityQueue.addAll(Arrays.asList(points));

        int[][] closest = new int[k][2];

        while (k > 0) {
            closest[k - 1] = priorityQueue.poll();
            k--;
        }

        return closest;
    }

    private double computeDistanceFromOrigin(int[] coords) {
        int x = coords[0];
        int y = coords[1];

        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
