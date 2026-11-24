import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // Sort the array to bring elements into potential progression order
        Arrays.sort(arr);
        
        // Calculate the expected common difference from the first two elements
        int diff = arr[1] - arr[0];
        
        // Verify that all subsequent consecutive pairs share this exact difference
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        
        return true;
    }
}
