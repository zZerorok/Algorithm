import java.util.*;

class Solution {
    public int solution(String s) {
        String[] split = s.split("");
        Stack<String> stack = new Stack<>();
        int index = 0;

        while (index < split.length) {
            if (stack.isEmpty()) {
                stack.push(split[index]);
            } else {
                
                if (stack.peek().equals(split[index])) {
                    stack.pop();
                } else {
                    stack.push(split[index]);
                }
            }
            index++;
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
