import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Map<Integer, Integer> CHEF_SCORES = new HashMap<>();
    private static final int CHEF_COUNT = 5;

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= CHEF_COUNT; i++) {
            String[] scores = READER.readLine().split(" ");
            CHEF_SCORES.put(i, sum(scores));
        }

        int winner = 0;
        int maxScore = 0;
        for (Map.Entry<Integer, Integer> entry : CHEF_SCORES.entrySet()) {
            Integer chefNumber = entry.getKey();
            Integer score = entry.getValue();

            if (score > maxScore) {
                winner = chefNumber;
                maxScore = score;
            }
        }

        WRITER.write(winner + " " + maxScore);
        WRITER.flush();
        WRITER.close();
        READER.close();
    }

    private static int sum(String[] scores) {
        return Arrays.stream(scores)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
