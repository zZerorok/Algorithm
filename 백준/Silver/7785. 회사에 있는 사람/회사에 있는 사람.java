import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter WRITER = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        Set<String> employees = new HashSet<>();
        int entryCount = Integer.parseInt(READER.readLine());
        for (int i = 0; i < entryCount; i++) {
            String[] entryData = READER.readLine().split(" ");
            String employeeName = entryData[0];
            String entryStatus = entryData[1];

            if (entryStatus.equals("enter")) {
                employees.add(employeeName);
            } else if (entryStatus.equals("leave")) {
                employees.remove(employeeName);
            }
        }

        List<String> sortedEmployees = new ArrayList<>(employees);
        sortedEmployees.sort(Comparator.reverseOrder());

        for (String employee : sortedEmployees) {
            WRITER.write(employee);
            WRITER.newLine();
        }

        WRITER.flush();
        WRITER.close();
        READER.close();
    }
}
