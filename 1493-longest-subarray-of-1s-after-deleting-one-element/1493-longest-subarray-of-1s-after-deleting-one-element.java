class Solution {
    public int longestSubarray(int[] nums) {
         int l = 0;
        int r = 0;

        int max = 0;
        int cnt = 0; // 윈도우에 존재하는 0의 개수

        while (r < nums.length) {
            if (nums[r] == 0) {
                cnt++;
            }

            if (cnt > 1) {
                while (nums[l] != 0) {
                    l++;
                }

                l++; // 0을 제거하기 위해 한칸 더 이동해야함.
                cnt--;
            }

            max = Math.max(max, r - l + 1 - 1);
            r++;
        }

        return max;
    }
}