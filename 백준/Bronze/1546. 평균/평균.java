import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int scoreCount = Integer.parseInt(reader.readLine());
        double[] scores = new double[scoreCount];
        String[] scoreNumbers = reader.readLine().split(" ");
        for (int i = 0; i < scoreCount; i++) {
            scores[i] = Integer.parseInt(scoreNumbers[i]);
        }

        double maxScore = 0;
        for (double score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }

        for (int i = 0; i < scoreCount; i++) {
            scores[i] = scores[i] / maxScore * 100;
        }

        double sum = 0;
        for (int i = 0; i < scoreCount; i++) {
            sum += scores[i];
        }

        double result = sum /scoreCount;

        writer.write(String.valueOf(result));
        writer.flush();
    }
}
