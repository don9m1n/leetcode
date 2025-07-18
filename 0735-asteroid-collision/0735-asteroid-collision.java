class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int current : asteroids) {
            boolean alive = true;

            while (!stack.isEmpty() && stack.peek() > 0 && current < 0) {
                int top = stack.peek();

                if (top < -current) {
                    stack.pop();
                } else if (top == -current) {
                    stack.pop();
                    alive = false;
                    break;
                } else {
                    alive = false;
                    break;
                }
            }

            if (alive) {
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