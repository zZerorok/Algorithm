import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int left = 0;
        int right = 10;
        int answer = 0;
        
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        while (right <= discount.length) {
            Map<String, Integer> discountMap = new HashMap<>();
            for (int i = left; i < right; i++) {
                discountMap.put(discount[i], discountMap.getOrDefault(discount[i], 0) + 1);
            }

            boolean isMatch = wantMap.keySet()
                    .stream()
                    .allMatch(key -> wantMap.get(key).equals(discountMap.getOrDefault(key, 0)));

            if (isMatch) {
                answer++;
            }

            left++;
            right++;
        }
        return answer;
    }
}