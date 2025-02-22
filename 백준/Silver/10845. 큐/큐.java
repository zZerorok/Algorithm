import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Deque<Integer> QUEUE = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        int commandCount = Integer.parseInt(READER.readLine());
        processCommand(commandCount);
    }

    private static void processCommand(int commandCount) throws IOException {
        for (int i = 0; i < commandCount; i++) {
            String command = READER.readLine();
            commandHandler(command);
        }
        WRITER.flush();
        WRITER.close();
    }

    private static void commandHandler(String command) throws IOException {
        if (command.startsWith("push")) {
            push(command);
        } else {
            write(getCommandResult(command));
        }
    }

    private static void push(String command) {
        QUEUE.offer(Integer.parseInt(command.split(" ")[1]));
    }

    private static int getCommandResult(String command) {
        return switch (command) {
            case "pop" -> QUEUE.isEmpty() ? -1 : QUEUE.pollFirst();
            case "size" -> QUEUE.size();
            case "empty" -> QUEUE.isEmpty() ? 1 : 0;
            case "front" -> QUEUE.isEmpty() ? -1 : QUEUE.peekFirst();
            case "back" -> QUEUE.isEmpty() ? -1 : QUEUE.peekLast();
            default -> throw new IllegalStateException("Unknown command: " + command);
        };
    }

    private static void write(int result) throws IOException {
        WRITER.write(result + System.lineSeparator());
    }
}
