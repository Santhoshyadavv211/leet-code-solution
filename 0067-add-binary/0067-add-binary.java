class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop from the end of both strings until all digits and carry are processed
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Append the current binary bit (0 or 1)
            result.append(sum % 2);
            // Update the carry for the next position
            carry = sum / 2;
        }

        // Reverse the built string since digits were added from right to left
        return result.reverse().toString();
    }
}
