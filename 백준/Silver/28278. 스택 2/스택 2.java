import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Stack<Integer> STACK = new Stack<>();

    public static void main(String[] args) throws IOException {
        int commandCount = Integer.parseInt(READER.readLine());
        for (int i = 0; i < commandCount; i++) {
            String command = READER.readLine();
            commandProcess(command);
        }

        printResult();
        closeResources();
    }

    private static void commandProcess(String command) throws IOException {
        switch (command) {
            case "2" -> write(STACK.isEmpty() ? -1 : STACK.pop());
            case "3" -> write(STACK.size());
            case "4" -> write(STACK.isEmpty() ? 1 : 0);
            case "5" -> write(STACK.isEmpty() ? -1 : STACK.peek());
            default -> STACK.push(Integer.parseInt(command.split(" ")[1]));
        }
    }

    private static void write(int number) throws IOException {
        WRITER.write(String.valueOf(number));
        WRITER.newLine();
    }

    private static void printResult() throws IOException {
        WRITER.flush();
    }

    private static void closeResources() throws IOException {
        WRITER.close();
        READER.close();
    }
}
