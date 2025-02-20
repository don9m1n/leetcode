class Solution {
    public int removeDuplicates(int[] nums) {
        int s = 2;
        int e = 2;

        while(e < nums.length) {

            if (nums[e] != nums[s - 2]) {
                nums[s] = nums[e];
                s++;
            }
            
            e++;
            
        }
        
        return s;
    }
}