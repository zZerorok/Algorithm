import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> multiples = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n < k * i) {
                break;
            }
            multiples.add(k * i);
        }
        
        return multiples.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}