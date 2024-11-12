import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        if (s.charAt(0) == ')') {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char current : s.toCharArray()) {
            if (stack.isEmpty() || current == '(') {
                stack.push(current);
            } else {
                stack.pop();
            }
        }
        
        if (!stack.isEmpty()) {
            return false;
        }

        return answer;
    }
}