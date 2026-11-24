import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            // 1. Find the minimum element in the current row and its column index
            int minVal = matrix[i][0];
            int minColIdx = 0;
            
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    minColIdx = j;
                }
            }

            // 2. Check if this minimum element is the maximum in its column
            boolean isMaxInCol = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][minColIdx] > minVal) {
                    isMaxInCol = false;
                    break;
                }
            }

            // 3. If both conditions hold, add it to the result list
            if (isMaxInCol) {
                result.add(minVal);
            }
        }

        return result;
    }
}
