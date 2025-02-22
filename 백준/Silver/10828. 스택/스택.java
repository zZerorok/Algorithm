import java.io.*;
import java.util.Stack;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Stack<Integer> STACK = new Stack<>();

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
        STACK.push(Integer.parseInt(command.split(" ")[1]));
    }

    private static int getCommandResult(String command) {
        return switch (command) {
            case "pop" -> STACK.isEmpty() ? -1 : STACK.pop();
            case "size" -> STACK.size();
            case "empty" -> STACK.isEmpty() ? 1 : 0;
            case "top" -> STACK.isEmpty() ? -1 : STACK.peek();
            default -> throw new IllegalStateException("Unknown command: " + command);
        };
    }

    private static void write(int result) throws IOException {
        WRITER.write(result + System.lineSeparator());
    }
}
