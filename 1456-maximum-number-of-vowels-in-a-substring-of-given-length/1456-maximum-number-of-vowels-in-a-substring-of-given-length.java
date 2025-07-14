class Solution {
    public int maxVowels(String s, int k) {
        Map<Character, Boolean> vowels = new HashMap<>();
        vowels.put('a', true);
        vowels.put('e', true);
        vowels.put('i', true);
        vowels.put('o', true);
        vowels.put('u', true);

        int start = 0;
        int end = k;
        int prev = 0;
        int max = 0;

        for (int i = 0; i < k; i++) {
            if(vowels.containsKey(s.charAt(i))){
                prev++;
                max++;
            }
        }

        while(end < s.length()){
            int cnt = 0;

            if (vowels.containsKey(s.charAt(start++))) {
                cnt--;
            }

            if (vowels.containsKey(s.charAt(end++))) {
                cnt++;
            }

            prev += cnt;
            max = Math.max(max, prev);
        }

        return max;
    }
}