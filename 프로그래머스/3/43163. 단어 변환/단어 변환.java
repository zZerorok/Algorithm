import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {
    public int solution(String begin, String target, String[] words) {
 if (!Set.of(words).contains(target)) {
            return 0;
        }

        boolean[] visited = new boolean[words.length];

        Queue<String> queue = new LinkedList<>();
        queue.add(begin);

        int step = 0;

        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                String currentWord = queue.poll();

                if (currentWord.equals(target)) {
                    return step;
                }

                checkWord(words, visited, queue, currentWord);
            }
            step++;
        }
        return 0;
    }

    private void checkWord(String[] words, boolean[] visited, Queue<String> queue, String currentWord) {
        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && isConvertible(currentWord, words[i])) {
                visited[i] = true;
                queue.add(words[i]);
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