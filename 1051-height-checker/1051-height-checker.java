import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        // Create a copy and sort it to get the expected order
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        
        int mismatchCount = 0;
        
        // Compare original heights with expected heights
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                mismatchCount++;
            }
        }
        
        return mismatchCount;
    }
}
