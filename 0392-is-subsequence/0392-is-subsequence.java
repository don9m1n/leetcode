class Solution {
    public boolean isSubsequence(String s, String t) {

        if (s.isEmpty()) {
            return true;
        }

        int sp = 0; // s pointer

        for (int tp = 0; tp < t.length(); tp++) {
            if(sp == s.length()) {
                return true;
            }
            
            if(t.charAt(tp) == s.charAt(sp)){
                sp++;
            }
        }

        return sp == s.length();
    }
}