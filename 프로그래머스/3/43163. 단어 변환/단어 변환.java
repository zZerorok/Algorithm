import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        if (!Set.of(words).contains(target)) {
            return 0;
        }

        Map<String, Boolean> map = new HashMap<>();
        for (String word : words) {
            map.put(word, false);
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(begin);

        int step = 0;
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                String currentWord = queue.poll();

                if (currentWord.equals(target)) {
                    return step;
                }

                processWords(map, queue, currentWord);
            }
            step++;
        }
        return 0;
    }

    private void processWords(Map<String, Boolean> map, Queue<String> queue, String currentWord) {
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            String word = entry.getKey();
            Boolean isVisited = entry.getValue();

            if (!isVisited && isConvertible(currentWord, word)) {
                map.put(word, true);
                queue.add(word);
            }
        }
    }

    private boolean isConvertible(String currentWord, String word) {
        int differentCount = 0;
        for (int i = 0; i < currentWord.length(); i++) {
            if (currentWord.charAt(i) != word.charAt(i)) {
                differentCount++;
            }
        }

        return differentCount == 1;
    }
}
