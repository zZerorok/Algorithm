import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        if (s.charAt(0) == ')') {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char current : s.toCharArray()) {
            // 스택이 비어있으면 값 저장
            if (stack.isEmpty() || current == '(') {
                stack.push(current);
            } else {
                stack.pop();
            }
        }
        
        if (!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}