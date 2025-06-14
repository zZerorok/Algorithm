import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> sortedEmergency = Arrays.stream(emergency)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Map<Integer, Integer> emergencyRank = new HashMap<>();
        for (int i = 0; i < sortedEmergency.size(); i++) {
            emergencyRank.put(sortedEmergency.get(i), i + 1);
        }

        int[] result = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            result[i] = emergencyRank.get(emergency[i]);
        }

        return result;
    }
}