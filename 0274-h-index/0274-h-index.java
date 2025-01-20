import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
       Arrays.sort(citations);

        for (int h = citations[citations.length - 1]; h >= 0; h--) {

            int count = 0;
            for (int i = 0; i < citations.length; i++) {

                // h번 이상 인용된 논문
                if (citations[i] >= h) {
                    count++;
                }
            }

            if (count >= h) {
                return h;
            }
        }

        return 0;
    }
}