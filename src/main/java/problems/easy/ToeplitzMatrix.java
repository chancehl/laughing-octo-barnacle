package problems.easy;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int column = 0;

        while (column < matrix[0].length) {
            int row = 0;

            while (row < matrix.length) {
                boolean hasSingleValue = this.doesDiagonalHaveSingleValue(row, column, matrix);

                if (!hasSingleValue) {
                    return false;
                }

                row++;
            }

            column++;
        }

        return true;
    }

    private boolean doesDiagonalHaveSingleValue(int startingRow, int startingColumn, int[][] matrix) {
        int row = startingRow;
        int col = startingColumn;

        int value = matrix[row][col];

        while (row < matrix.length && col < matrix[0].length) {
            if (matrix[row][col] != value) {
                return false;
            }

            row++;
            col++;
        }

        return true;
    }
}
