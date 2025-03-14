import java.io.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(READER.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] input = READER.readLine().split(" ");
            int studentCount = Integer.parseInt(input[0]);
            int[] scores = new int[studentCount];
            
            int sum = sum(input, scores);

            double average = (double) sum / studentCount;
            
            int aboveAverageCount = countAboveAverage(scores, average);

            double result = (double) aboveAverageCount / studentCount * 100;

            WRITER.write(String.format("%.3f", result) + "%");
            WRITER.newLine();
        }

        WRITER.flush();
    }

    private static int sum(String[] input, int[] scores) {
        int sum = 0;
        for (int j = 0; j < scores.length; j++) {
            int score = Integer.parseInt(input[j + 1]);
            scores[j] = score;
            sum += score;
        }
        return sum;
    }

    private static int countAboveAverage(int[] scores, double average) {
        int aboveAverageCount = 0;
        for (int score : scores) {
            if (score > average) {
                aboveAverageCount += 1;
            }
        }
        return aboveAverageCount;
    }
}
