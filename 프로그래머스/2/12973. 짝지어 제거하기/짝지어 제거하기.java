import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char currentChar : s.toCharArray()) {
            if (stack.isEmpty() || currentChar != stack.peek()) {
                stack.push(currentChar);
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
