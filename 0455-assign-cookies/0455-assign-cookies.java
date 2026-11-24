import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sort both greed factors and cookie sizes in ascending order
        Arrays.sort(g);
        Arrays.sort(s);
        
        int childIndex = 0;
        int cookieIndex = 0;
        
        // Iterate until we run out of either children or cookies
        while (childIndex < g.length && cookieIndex < s.length) {
            // If the current cookie can satisfy the least greedy remaining child
            if (s[cookieIndex] >= g[childIndex]) {
                childIndex++; // Move to the next child
            }
            // Move to the next cookie regardless (either used or too small)
            cookieIndex++;
        }
        
        return childIndex;
    }
}
