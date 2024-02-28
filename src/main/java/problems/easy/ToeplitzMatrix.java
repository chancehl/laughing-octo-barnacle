package problems.easy;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Complexity: O(M x N)
 *
 * Ironically, the unoptimized brute force solution was considerably faster because of the overhead
 * of managing the List class in Java.
 */
public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        List<List<Integer>> diagonals = this.generateDiagonals(matrix);

        for (List<Integer> diagonal : diagonals) {
            for (int i : diagonal) {
                if (i != diagonal.getFirst()) {
                    return false;
                }
            }
        }

        return true;
    }

    private List<List<Integer>> generateDiagonals(int[][] matrix) {
        List<List<Integer>> diagonals = new ArrayList<>();

        Set<Point> visited = new HashSet<>();

        int startingRow = 0;

        while (startingRow < matrix.length) {
            int startingCol = 0;

            while (startingCol < matrix[0].length) {
                if (!visited.contains(new Point(startingRow, startingCol))) {
                    int i = startingRow;
                    int j = startingCol;

                    List<Integer> diagonal = new ArrayList<>();

                    while (i < matrix.length && j < matrix[0].length) {
                        diagonal.add(matrix[i][j]);

                        visited.add(new Point(i, j));

                        i++;
                        j++;
                    }

                    diagonals.add(diagonal);
                }

                startingCol++;
            }

            startingRow++;
        }

        return diagonals;
    }
}
