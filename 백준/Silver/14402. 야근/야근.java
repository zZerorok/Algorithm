import java.io.*;
import java.util.*;

public class Main {

    private static final Map<String, Integer> EMPLOYEES_ENTRY_INFO = new HashMap<>();

    private static int overtimeCount = 0;

    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        var writer = new BufferedWriter(new OutputStreamWriter(System.out));

        var entryCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < entryCount; i++) {
            var tokenizer = new StringTokenizer(reader.readLine());
            var employeeName = tokenizer.nextToken();
            var entryStatus = tokenizer.nextToken();

            if (entryStatus.equals("-")) {
                checkEntry(employeeName);
                continue;
            }

            recordEntry(employeeName);
        }

        calculateOvertime();

        writer.write(String.valueOf(overtimeCount));
        writer.flush();
    }

    private static void recordEntry(String employeeName) {
        EMPLOYEES_ENTRY_INFO.put(employeeName, EMPLOYEES_ENTRY_INFO.getOrDefault(employeeName, 0) + 1);
    }

    private static void checkEntry(String employeeName) {
        var entryCount = EMPLOYEES_ENTRY_INFO.get(employeeName);
        if (entryCount == null || entryCount == 0) {
            overtimeCount += 1;
        } else {
            EMPLOYEES_ENTRY_INFO.put(employeeName, entryCount - 1);
        }
    }

    private static void calculateOvertime() {
        for (var value : EMPLOYEES_ENTRY_INFO.values()) {
            if (value > 0) {
                overtimeCount += value;
            }
        }
    }
}
