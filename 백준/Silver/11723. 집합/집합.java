import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Set<Integer> RESULT = new HashSet<>();

    public static void main(String[] args) throws IOException {
        int operationCount = Integer.parseInt(READER.readLine());
        for (int i = 0; i < operationCount; i++) {
            String[] commands = READER.readLine().split(" ");
            execute(commands);
        }

        WRITER.flush();
    }

    public static void execute(String[] commands) throws IOException {
        String command = commands[0];
        if (command.equals("all")) {
            fillAll();
            return;
        }

        if (command.equals("empty")) {
            RESULT.clear();
            return;
        }

        int value = Integer.parseInt(commands[1]);
        switch (command) {
            case "add" -> RESULT.add(value);
            case "remove" -> RESULT.remove(value);
            case "toggle" -> toggle(value);
            case "check" -> check(value);
        }
    }

    private static void fillAll() {
        for (int i = 1; i <= 20; i++) {
            RESULT.add(i);
        }
    }

    private static void toggle(int value) {
        if (RESULT.contains(value)) {
            RESULT.remove(value);
        } else {
            RESULT.add(value);
        }
    }

    private static void check(int value) throws IOException {
        WRITER.write(RESULT.contains(value) ? "1" : "0");
        WRITER.newLine();
    }
}
