class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int current : asteroids) {
            boolean flag = true;

            if (current < 0) {
                while (!stack.isEmpty() && stack.peek() > 0) {
                    int top = stack.peek();

                    if (top < -current) {
                        stack.pop();
                    } else if (top == -current) {
                        stack.pop();
                        flag = false;
                        break;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                stack.push(current);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}