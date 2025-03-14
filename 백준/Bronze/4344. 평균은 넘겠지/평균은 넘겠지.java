import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int C = Integer.parseInt(READER.readLine());

        for (int i = 0; i < C; i++) {
            String[] input = READER.readLine().split(" ");
            int studentCount = Integer.parseInt(input[0]);

            List<Integer> scores = new ArrayList<>();
            for (int j = 1; j <= studentCount; j++) {
                int score = Integer.parseInt(input[j]);
                scores.add(score);
            }
            
            double average = (double) scores.stream().mapToInt(Integer::intValue).sum() / studentCount;

            int aboveAverageCount = 0;
            for (Integer score : scores) {
                if (score > average) {
                    aboveAverageCount += 1;
                }
            }

            double result = (double) aboveAverageCount / studentCount * 100;
            WRITER.write(String.format("%.3f", result) + "%");
            WRITER.newLine();
        }

        WRITER.flush();
    }
}
