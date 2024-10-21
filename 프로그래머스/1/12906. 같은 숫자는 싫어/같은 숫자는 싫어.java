import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int number : arr) {
            if (stack.isEmpty() || number != stack.peek()) {
                stack.push(number);
            }
        }
        
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}