class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }

        if (flowerbed.length == 1) {
            if(flowerbed[0] == 0){
                n--;
            }

            return n == 0;
        }

        int i = 0;
        while(i < flowerbed.length){
            if(flowerbed[i] == 0){
                if (i == 0) {
                    if (flowerbed[i + 1] == 0) {
                        n--;
                        i += 2;
                    } else {
                        i++;
                    }
                } else if(i == flowerbed.length - 1) {
                    if (flowerbed[i - 1] == 0) {
                        n--;
                        i += 2;
                    } else {
                        i++;
                    }
                } else {
                    if(flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                        n--;
                        i += 2;
                    } else {
                        i++;
                    }
                }
            } else {
                i++;
            }
            
            if (n == 0) {
                return true;
            }
        }

        return n < 0;
    }
}