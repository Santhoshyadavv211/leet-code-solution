class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCount++;
            }
        }
        
        // Case 1: All letters are capitals
        // Case 2: No letters are capitals
        // Case 3: Only the first letter is capital
        return upperCount == word.length() || 
               upperCount == 0 || 
               (upperCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
