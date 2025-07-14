class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int prefixSum = 0;

        for (int p : gain) {
            max = Math.max(max, prefixSum += p);
        }

        return max;
    }
}