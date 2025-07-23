import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader INPUT_READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT_WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    private static final String FAIL_MESSAGE = "KIN";
    private static final int DIFF_THRESHOLD = 4;

    public static void main(String[] args) throws IOException {
        int testCaseCount = Integer.parseInt(INPUT_READER.readLine());

        for (int i = 0; i < testCaseCount; i++) {
            String[] inputScores = INPUT_READER.readLine().split(" ");
            String result = process(inputScores);
            printResult(result);
        }

        OUTPUT_WRITER.flush();
        OUTPUT_WRITER.close();
        INPUT_READER.close();
    }

    private static String process(String[] inputScores) {
        int[] scores = parseScores(inputScores);

        if (isDifferenceTooHigh(scores)) {
            return FAIL_MESSAGE;
        }

        return String.valueOf(calculateSum(scores));
    }

    private static int[] parseScores(String[] inputScores) {
        return Arrays.stream(inputScores)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
    }

    private static boolean isDifferenceTooHigh(int[] scores) {
        int min = scores[1];
        int max = scores[3];
        return max - min >= DIFF_THRESHOLD;
    }

    private static int calculateSum(int[] scores) {
        return scores[1] + scores[2] + scores[3];
    }

    private static void printResult(String result) throws IOException {
        OUTPUT_WRITER.write(result);
        OUTPUT_WRITER.newLine();
    }
}
