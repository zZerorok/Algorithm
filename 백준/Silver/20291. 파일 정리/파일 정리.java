import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<>();
        int fileCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < fileCount; i++) {
            String[] parts = reader.readLine().split("\\.");
            String extension = parts[1];
            map.put(extension, map.getOrDefault(extension, 0) + 1);
        }

        List<String> extensions = new ArrayList<>(map.keySet());

        Collections.sort(extensions);

        for (String extension : extensions) {
            writer.write(extension + " " + map.get(extension));
            writer.newLine();
        }

        writer.flush();
    }
}
