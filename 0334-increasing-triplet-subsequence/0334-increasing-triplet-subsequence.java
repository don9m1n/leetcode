class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (first >= num) {
                first = num;
            } else if(second >= num) {
                second = num;
            } else {
                return true;
            }
        }

        return false;
    }
}