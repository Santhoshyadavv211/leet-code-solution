class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int row = 0;
        int col = n - 1;
        int count = 0;

        while (row < m && col >= 0) {
            if (grid[row][col] < 0) {
                // Since columns are sorted in non-increasing order,
                // all elements below this cell in the current column are also negative.
                count += (m - row);
                col--; // Move left to check the previous column
            } else {
                // Current value is non-negative, so everything to its left is also non-negative.
                row++; // Move down to the next row
            }
        }

        return count;
    }
}
