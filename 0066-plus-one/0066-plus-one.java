import java.math.BigInteger;
import java.util.Stack;

class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger num = BigInteger.ZERO;
        for (int digit : digits) {
            num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(digit));
        }

        num = num.add(BigInteger.ONE);

        Stack<BigInteger> stack = new Stack<>();
        while (num.compareTo(BigInteger.ZERO) > 0) {
            stack.push(num.mod(BigInteger.TEN));
            num = num.divide(BigInteger.TEN);
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.pop().intValue();
        }

        return answer;
    }
}