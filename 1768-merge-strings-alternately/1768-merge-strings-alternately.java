class Solution {
    public String mergeAlternately(String word1, String word2) {
        int end = Math.min(word1.length(), word2.length());

        StringBuilder comb = new StringBuilder();
        for (int start = 0; start < end; start++) {
            comb.append(word1.charAt(start)).append(word2.charAt(start));
        }

        if(word1.length() > word2.length()){
            comb.append(word1.substring(end));
        } else {
            comb.append(word2.substring(end));
        }

        return comb.toString();
    }
}