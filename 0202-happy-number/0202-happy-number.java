import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(!set.contains(n)) {

            set.add(n);
            int sum = 0;

            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }
}