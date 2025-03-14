import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(reader.readLine());

        for (int i = 0; i < C; i++) {
            String[] input = reader.readLine().split(" ");
            int studentCount = Integer.parseInt(input[0]);
            int sum = 0;
            for (int j = 1; j <= studentCount; j++) {
                int score = Integer.parseInt(input[j]);
                sum += score;
            }
            double average = (double) sum / studentCount;

            int aboveAverageCount = 0;
            for (int j = 1; j <= studentCount ; j++) {
                if (average < Integer.parseInt(input[j])) {
                    aboveAverageCount++;
                }
            }

            double result = (double) aboveAverageCount / studentCount * 100;
            System.out.println(String.format("%.3f", result) + "%");
        }
    }
}
