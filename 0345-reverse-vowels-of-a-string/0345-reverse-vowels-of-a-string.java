class Solution {
    public String reverseVowels(String s) {
        List<String> vowels = new ArrayList<>();
        String[] words = s.split("");

        for (String word : words) {
            if (word.matches("[aeiouAEIOU]")) {
                vowels.add(word);
            }
        }

        StringBuilder sb = new StringBuilder();
        int index = vowels.size() - 1;

        for (String word : words) {
            if (word.matches("[aeiouAEIOU]")) {
                sb.append(vowels.get(index--));
            } else {
                sb.append(word);
            }
        }

        return sb.toString();
    }
}