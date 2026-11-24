class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start at the top-right corner
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            int current = matrix[row][col];

            if (current == target) {
                return true;
            } else if (current > target) {
                // Target must be to the left since column values increase downwards
                col--;
            } else {
                // Target must be below since row values increase to the right
                row++;
            }
        }

        return false;
    }
}
