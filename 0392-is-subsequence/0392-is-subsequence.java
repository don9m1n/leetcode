class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp = 0; // s pointer
        int tp = 0; // t pointer

        while(sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }

            tp++;
        }

        return sp == s.length();
    }
}