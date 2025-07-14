class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length + 1];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        int right = prefix.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (prefix[i] == prefix[right] - prefix[i + 1]) {
                return i;
            }
        }

        return -1;
    }
}