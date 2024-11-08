import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] firstPattern = new int[]{1, 2, 3, 4, 5};
        int[] secondPattern = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdPattern = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int firstScore = calculateScore(answers, firstPattern);
        int secondScore = calculateScore(answers, secondPattern);
        int thirdScore = calculateScore(answers, thirdPattern);

        int maxScore = Math.max(firstScore, Math.max(secondScore, thirdScore));

        List<Integer> scores = new ArrayList<>();
        if (firstScore == maxScore) {
            scores.add(1);
        }
        if (secondScore == maxScore) {
            scores.add(2);
        }
        if (thirdScore == maxScore) {
            scores.add(3);
        }

        return scores.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int calculateScore(int[] answers, int[] pattern) {
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern[i % pattern.length]) {
                count++;
            }
        }
        return count;
    }
}