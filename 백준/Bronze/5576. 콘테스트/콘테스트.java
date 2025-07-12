import java.io.*;
import java.util.*;

public class Main {

    public static final int SCORE_COUNT = 10;
    public static final int TOP_SCORE_COUNT = 3;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstTotalScore = getTotalScore(reader);
        int secondTotalScore = getTotalScore(reader);
        
        writer.write(firstTotalScore + " " + secondTotalScore);
        writer.flush();
    }

    private static int getTotalScore(BufferedReader reader) throws IOException {
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < SCORE_COUNT; i++) {
            scores.add(Integer.parseInt(reader.readLine()));
        }

        scores.sort(Comparator.reverseOrder());

        int sum = 0;
        for (int i = 0; i < TOP_SCORE_COUNT; i++) {
            sum += scores.get(i);
        }
        return sum;
    }
}
