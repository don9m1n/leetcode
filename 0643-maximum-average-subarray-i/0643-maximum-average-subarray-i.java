class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s = 0;
        int e = k;

        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double max = Integer.MIN_VALUE;
        max = Math.max(max, sum / k);
        
        while (e < nums.length) {
            sum = sum - nums[s++] + nums[e++];
            max = Math.max(max, sum / k);
        }

        return max;
    }
}