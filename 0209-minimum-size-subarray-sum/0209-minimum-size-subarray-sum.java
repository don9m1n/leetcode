class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0;

        int prefixSum = 0;
        int minLen = Integer.MAX_VALUE;

        while (end < nums.length) {

            prefixSum += nums[end++];

            while(prefixSum >= target) {
                minLen = Math.min(end - start, minLen);
                prefixSum -= nums[start++];
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}