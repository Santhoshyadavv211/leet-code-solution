class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (except 0 itself) cannot be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedHalf = 0;
        while (x > revertedHalf) {
            revertedHalf = revertedHalf * 10 + x % 10;
            x /= 10;
        }

        // For even length numbers: x == revertedHalf
        // For odd length numbers: x == revertedHalf / 10 (ignores the middle digit)
        return x == revertedHalf || x == revertedHalf / 10;
    }
}
