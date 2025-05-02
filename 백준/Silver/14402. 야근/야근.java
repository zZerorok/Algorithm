import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> employees = new HashMap<>();

        int entryCount = Integer.parseInt(reader.readLine());
        int overtimeCount = 0;
        for (int i = 0; i < entryCount; i++) {
            String[] entryInfo = reader.readLine().split(" ");
            String employeeName = entryInfo[0];
            String entryStatus = entryInfo[1];

            if (entryStatus.equals("+")) {
                employees.put(employeeName, employees.getOrDefault(employeeName, 0) + 1);
            } else {
                Integer count = employees.get(employeeName);
                if (count == null || count == 0) {
                    overtimeCount += 1;
                } else {
                    employees.put(employeeName, count - 1);
                }
            }
        }

        for (Integer value : employees.values()) {
            if (value > 0) {
                overtimeCount += value;
            }
        }

        writer.write(String.valueOf(overtimeCount));
        writer.flush();
    }
}
