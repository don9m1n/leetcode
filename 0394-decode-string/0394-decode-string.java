class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ']') {

                StringBuilder word = new StringBuilder();

                while (!stack.isEmpty() && stack.peek() != '[') {
                    word.append(stack.pop());
                }

                while(!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                }

                StringBuilder num = new StringBuilder();

                while(!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9') {
                    num.append(stack.pop());
                }

                int count = Integer.parseInt(num.reverse().toString());

                char[] charArray = word.reverse().toString().repeat(count).toCharArray();

                for (char cc : charArray) {
                    stack.push(cc);
                }
            } else {
                stack.push(c);
            }
        }

        StringBuilder answer = new StringBuilder();
        while(!stack.isEmpty()){
            answer.append(stack.pop());
        }

        return answer.reverse().toString();
    }
}