class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder palindromeStr = new StringBuilder();

        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                palindromeStr.append(s.charAt(i));
            }
        }

        int left = 0;
        int right = palindromeStr.length() - 1;

        while (left < right) {
            if (palindromeStr.charAt(left) != palindromeStr.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}