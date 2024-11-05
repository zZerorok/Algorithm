import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> words = new ArrayList<>();
        for (String word : strArr) {
            if (!word.contains("ad")) {
                words.add(word);
            }
        }

        return words.toArray(String[]::new);
    }
}