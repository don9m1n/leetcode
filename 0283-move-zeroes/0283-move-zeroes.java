class Solution {
    public void moveZeroes(int[] nums) {
        int s = 0;
        int e = 0;

        while(e < nums.length) {
            if(nums[e] != 0) {
                int temp = nums[e];
                nums[e] = nums[s];
                nums[s] = temp;
                s++;
            }
            
            e++;
        }
    }
}