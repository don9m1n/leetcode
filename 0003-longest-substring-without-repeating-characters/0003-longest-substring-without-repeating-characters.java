import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0;
        Set<Character> set = new LinkedHashSet<>();

        int max = 0;
        while(end < s.length()) {

            // 중복 문자가 없어질 때까지 삭제 처리
            while(set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));
            }

            set.add(s.charAt(end++));
            max = Math.max(max, end - start);
        }

        return max;
    }
}