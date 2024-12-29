import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        Map<String, Integer> discountMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            discountMap.put(discount[i], discountMap.getOrDefault(discount[i], 0) + 1);
        }

        if (isMatch(wantMap, discountMap)) {
            answer++;
        }

        for (int i = 10; i < discount.length; i++) {
            String first = discount[i - 10];
            discountMap.put(first, discountMap.get(first) - 1);
            if (discountMap.get(first) == 0) {
                discountMap.remove(first);
            }

            String last = discount[i];
            discountMap.put(last, discountMap.getOrDefault(last, 0) + 1);

            if (isMatch(wantMap, discountMap)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isMatch(Map<String, Integer> wantMap, Map<String, Integer> discountMap) {
        for (String product : wantMap.keySet()) {
            if (discountMap.getOrDefault(product, 0) < wantMap.get(product)) {
                return false;
            }
        }
        return true;
    }
}