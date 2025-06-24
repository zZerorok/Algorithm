import java.io.*;
import java.util.*;

public class Main {

    private static final Set<Integer> RESULT = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int operationCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < operationCount; i++) {
            String[] commands = reader.readLine().split(" ");
            operation(commands, writer);
        }

        writer.flush();
    }

    public static void operation(String[] commands, BufferedWriter writer) throws IOException {
        String command = commands[0];
        if (command.equals("all")) {
            fillAll();
            return;
        } else if (command.equals("empty")) {
            clearAll();
            return;
        }

        int value = Integer.parseInt(commands[1]);
        switch (command) {
            case "add":
                add(value);
                break;

            case "remove":
                remove(value);
                break;

            case "check":
                writer.write(String.valueOf(check(value)));
                writer.newLine();
                break;

            case "toggle":
                toggle(value);
                break;
        }
    }

    public static void add(int value) {
        RESULT.add(value);
    }

    public static void remove(int value) {
        RESULT.remove(value);
    }

    public static int check(int value) {
        return RESULT.contains(value) ? 1 : 0;
    }

    public static void toggle(int value) {
        if (RESULT.contains(value)) {
            RESULT.remove(value);
        } else {
            RESULT.add(value);
        }
    }

    public static void fillAll() {
        clearAll();
        for (int i = 1; i <= 20; i++) {
            RESULT.add(i);
        }
    }

    public static void clearAll() {
        RESULT.clear();
    }
}
