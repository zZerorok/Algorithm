import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int tangerineNum : tangerine) {
            map.put(tangerineNum, map.getOrDefault(tangerineNum, 0) + 1);
        }

        List<Integer> quantities = new ArrayList<>(map.values());
        Collections.sort(quantities, Collections.reverseOrder());

        int answer = 0;
        for (Integer quantity : quantities) {
            if (k <= quantity) {
                answer++;
                break;
            }

            k -= quantity;
            answer++;

            if (k <= 0) {
                break;
            }
        }
        return answer;
    }
}