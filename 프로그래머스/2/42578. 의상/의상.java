import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }

        int combinationCount = 1;
        for (Integer value : map.values()) {
            combinationCount *= (value + 1);
        }

        return combinationCount - 1;
    }
}