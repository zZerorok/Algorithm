import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>();

        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {
            String[] command = reader.readLine().split(" ");
            switch (command[0]) {
                case "1" -> deque.addFirst(Integer.parseInt(command[1]));
                case "2" -> deque.addLast(Integer.parseInt(command[1]));
                case "3" -> printWithNewLine(writer, deque.isEmpty() ? -1 : deque.pollFirst());
                case "4" -> printWithNewLine(writer, deque.isEmpty() ? -1 : deque.pollLast());
                case "5" -> printWithNewLine(writer, deque.size());
                case "6" -> printWithNewLine(writer, deque.isEmpty() ? 1 : 0);
                case "7" -> printWithNewLine(writer, deque.isEmpty() ? -1 : deque.peekFirst());
                case "8" -> printWithNewLine(writer, deque.isEmpty() ? -1 : deque.peekLast());
            }
        }

        writer.flush();
        writer.close();
        reader.close();
    }

    private static void printWithNewLine(BufferedWriter writer, int value) throws IOException {
        writer.write(String.valueOf(value));
        writer.newLine();
    }
}
