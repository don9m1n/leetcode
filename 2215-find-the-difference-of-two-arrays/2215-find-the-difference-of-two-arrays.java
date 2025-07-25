class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }
        
        Iterator<Integer> it = set2.iterator();
        while(it.hasNext()){
            int num = it.next();
            
            if(set1.contains(num)){
                set1.remove(num);
                it.remove();
            }
        }

        return List.of(new ArrayList<>(set1), new ArrayList<>(set2));
    }
}