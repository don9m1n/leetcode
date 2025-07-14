class Solution {
    public int maxVowels(String s, int k) {
         Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        int start = 0;
        int end = k;

        int cnt = 0;
        for (int i = 0; i < k; i++) {
            if(vowels.contains(s.charAt(i))){
                cnt++;
            }
        }

        int max = cnt;

        while(end < s.length()){
            if (vowels.contains(s.charAt(start++))) {
                cnt--;
            }

            if (vowels.contains(s.charAt(end++))) {
                cnt++;
            }

            max = Math.max(max, cnt);
        }

        return max;
    }
}