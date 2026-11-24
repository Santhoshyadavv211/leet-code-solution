class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        
        // If ch is not found, return the original word
        if (index == -1) {
            return word;
        }
        
        // Extract and reverse the prefix up to the found index (inclusive)
        StringBuilder sb = new StringBuilder(word.substring(0, index + 1));
        sb.reverse();
        
        // Append the remaining part of the string
        sb.append(word.substring(index + 1));
        
        return sb.toString();
    }
}
