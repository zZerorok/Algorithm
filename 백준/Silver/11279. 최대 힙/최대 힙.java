import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> descendingQueue = new PriorityQueue<>(Collections.reverseOrder());

        int calculateCount = Integer.parseInt(READER.readLine());
        for (int i = 0; i < calculateCount; i++) {
            int value = Integer.parseInt(READER.readLine());
            if (value == 0) {
                int maxNumber = getMaxNumber(descendingQueue);
                write(maxNumber);
            } else {
                descendingQueue.add(value);
            }
        }

        printResult();
    }

    private static int getMaxNumber(PriorityQueue<Integer> queue) {
        if (queue.isEmpty()) {
            return 0;
        }
        return queue.poll();
    }

    private static void write(int value) throws IOException {
        WRITER.write(String.valueOf(value));
        WRITER.newLine();
    }

    private static void printResult() throws IOException {
        WRITER.flush();
    }
}
