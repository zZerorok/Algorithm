import java.io.*;
import java.util.*;

public class Main {

    public static final int STUDENT_COUNT = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < STUDENT_COUNT; i++) {
            int score = Integer.parseInt(reader.readLine());
            scores.add(Math.max(score, 40));
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        int result = sum / STUDENT_COUNT;

        writer.write(String.valueOf(result));
        writer.flush();
    }
}
