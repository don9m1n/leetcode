class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = flowerbed.length - 1; i >= 0; i--) {

            if (n == 0) {
                break;
            }

            if (flowerbed[i] == 0) {
                int prev = Math.max(0, i - 1);
                int next = Math.min(flowerbed.length - 1, i + 1);
                if (flowerbed[prev] == 0 && flowerbed[next] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n == 0;
    }
}