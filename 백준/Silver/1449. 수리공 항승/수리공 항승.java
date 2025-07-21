import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputTokens = reader.readLine().split(" ");
        int tapeLength = Integer.parseInt(inputTokens[1]);

        List<Integer> leakPositions = toLeakPositions(reader.readLine());

        int tapeCount = calculateTapeCount(leakPositions, tapeLength);

        printResult(writer, tapeCount);
    }

    private static List<Integer> toLeakPositions(String line) {
        return Arrays.stream(line.split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toUnmodifiableList());
    }

    private static int calculateTapeCount(List<Integer> positons, int length) {
        int tapeCount = 0;
        double tapeLength = 0.0;
        for (int leakPosition : positons) {
            double LeakStartPoint = leakPosition - 0.5;

            if (LeakStartPoint >= tapeLength) {
                tapeCount += 1;
                tapeLength = LeakStartPoint + length;
            }
        }
        return tapeCount;
    }

    private static void printResult(BufferedWriter writer, int tapeCount) throws IOException {
        writer.write(String.valueOf(tapeCount));
        writer.flush();
    }
}
