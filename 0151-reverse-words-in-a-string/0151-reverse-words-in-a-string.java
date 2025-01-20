class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);

        sb.append(prev);

        for (int i = 1; i < s.length(); i++) {

            if(prev == ' ' && s.charAt(i) == ' ') {
                continue;
            }

            sb.append(s.charAt(i));
            prev = s.charAt(i);
        }

        String[] words = sb.toString().split(" ");
        StringBuilder reverse = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i]).append(" ");
        }

        return reverse.toString().trim();
    }
}