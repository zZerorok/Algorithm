import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        
        for (int num : numlist) {
            if (num % n == 0) {
                answer.add(num);
            }
        }
        
        return answer.stream().mapToInt(num -> num).toArray();
    }
}