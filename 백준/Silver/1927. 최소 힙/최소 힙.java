import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder builder = new StringBuilder();
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();

        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            long number = Long.parseLong(reader.readLine());

            if (number == 0) {
                long min = priorityQueue.isEmpty() ? 0 : priorityQueue.poll();
                write(builder, min);
            } else {
                priorityQueue.offer(number);
            }
        }

        writer.write(builder.toString());
        writer.flush();
    }

    private static void write(StringBuilder builder, long number) {
        builder.append(number).append(System.lineSeparator());
    }
}
