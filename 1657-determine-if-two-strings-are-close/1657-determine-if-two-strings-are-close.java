class Solution {
    public boolean closeStrings(String word1, String word2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            set1.add(word1.charAt(i));
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < word2.length(); i++) {
            set2.add(word2.charAt(i));
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if (!set1.equals(set2)) {
            return false;
        }

        List<Integer> list1 = new ArrayList<>(map1.values());
        List<Integer> list2 = new ArrayList<>(map2.values());
        Collections.sort(list1);
        Collections.sort(list2);

        for (int i = 0; i < list1.size(); i++) {
            if(!Objects.equals(list1.get(i), list2.get(i))){
                return false;
            }
        }

        return true;
    }
}