class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int max = Integer.MIN_VALUE;
        while(l < r){
            int w = r - l;
            int h = Math.min(height[l], height[r]);
            int amount = w * h;

            max = Math.max(max, amount);

            if(height[l] < height[r]){
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}