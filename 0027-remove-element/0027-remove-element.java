class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int[] copy = new int[nums.length];
        int copyIndex = 0;
        
        for (int num : nums) {
            if (num == val) {
                count++;
            } else {
                copy[copyIndex++] = num;
            }
        }

        System.arraycopy(copy, 0, nums, 0, nums.length);
        return nums.length - count;
    }
}