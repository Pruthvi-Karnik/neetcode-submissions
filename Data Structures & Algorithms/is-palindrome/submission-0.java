public class Solution {
    public boolean isPalindrome(String s) {
        // Initialize pointers at both ends of the string
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Move the left pointer forward if the character is not alphanumeric
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } 
            // Move the right pointer backward if the character is not alphanumeric
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } 
            // If both characters are alphanumeric, compare them case-insensitively
            else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false; // Mismatch found, not a palindrome
                }
                left++;
                right--;
            }
        }
        
        return true; // All valid pairs matched successfully
    }
}