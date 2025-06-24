import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        OperationResult result = new OperationResult();

        int operationCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < operationCount; i++) {
            String[] commands = reader.readLine().split(" ");
            executeCommand(result, commands, writer);
        }

        writer.flush();
    }

    public static void executeCommand(OperationResult result, String[] commands, BufferedWriter writer) throws IOException {
        String command = commands[0];
        if (command.equals("all")) {
            result.fillAll();
            return;
        }

        if (command.equals("empty")) {
            result.clearAll();
            return;
        }

        int value = Integer.parseInt(commands[1]);
        switch (command) {
            case "add" -> result.add(value);
            case "remove" -> result.remove(value);
            case "toggle" -> result.toggle(value);
            case "check" -> {
                writer.write(result.check(value) ? "1" : "0");
                writer.newLine();
            }
        }
    }

    private static class OperationResult {

        private final Set<Integer> elements = new HashSet<>();

        public void add(int value) {
            elements.add(value);
        }

        public void remove(int value) {
            elements.remove(value);
        }

        public boolean check(int value) {
            return elements.contains(value);
        }

        public void toggle(int value) {
            if (elements.contains(value)) {
                elements.remove(value);
            } else {
                elements.add(value);
            }
        }

        public void fillAll() {
            for (int i = 1; i <= 20; i++) {
                elements.add(i);
            }
        }

        public void clearAll() {
            elements.clear();
        }
    }
}
