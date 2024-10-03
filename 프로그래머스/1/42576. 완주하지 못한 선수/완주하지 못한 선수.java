import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participants = new HashMap<>();

        for (String player : participant) {
            participants.put(player, participants.getOrDefault(player, 0) + 1);
        }

        for (String completedPlayer : completion) {
            participants.put(completedPlayer, participants.get(completedPlayer) - 1);
        }
        
        for (Map.Entry<String, Integer> entry : participants.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }
}