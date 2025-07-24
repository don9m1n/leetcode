class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int cnt = 0;
        int max = 0;

        while (r < nums.length) {
            if (nums[r] == 0) {
                cnt++;
            }

            // 0의 개수가 k를 넘어가면 왼쪽 포인터를 이동시켜야함.
            if (cnt > k) {
                while (nums[l] != 0) {
                    l++;
                }

                l++;
                cnt--;
            }

            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}