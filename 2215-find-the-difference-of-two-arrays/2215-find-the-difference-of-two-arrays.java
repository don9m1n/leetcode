class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, 1);
        }

        for (int num : nums2) {
            if (!map.containsKey(num)) {
                if (!list2.contains(num)) {
                    list2.add(num);
                }
            } else {
                map.put(num, map.get(num) - 1);
            }
        }
        
        for (int key : map.keySet()) {
            if (map.get(key) > 0) {
                list1.add(key);
            }
        }

        return List.of(list1, list2);
    }
}