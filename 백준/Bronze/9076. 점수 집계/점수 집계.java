import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testcase; i++) {
            List<Integer> scores = new ArrayList<>();
            String[] inputScores = reader.readLine().split(" ");
            for (String score : inputScores) {
                scores.add(Integer.parseInt(score));
            }

            Collections.sort(scores);

            scores.remove(0);
            scores.remove(scores.size() - 1);

            int minScore = scores.get(0);
            int maxScore = scores.get(scores.size() - 1);
            int sum = 0;
            if (maxScore - minScore < 4) {
                for (int score : scores) {
                    sum += score;
                }
                writer.write(String.valueOf(sum));
                writer.newLine();
            } else {
                writer.write("KIN");
                writer.newLine();
            }
        }
        writer.flush();
    }
}
