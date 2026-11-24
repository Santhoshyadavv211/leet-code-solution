class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // Move left pointer forward if not a letter or digit
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } 
            // Move right pointer backward if not a letter or digit
            else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } 
            // Compare lowercase versions of both valid characters
            else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}
