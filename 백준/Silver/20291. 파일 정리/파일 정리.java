import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> extensionMap = new HashMap<>();
        int fileCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < fileCount; i++) {
            String[] parts = reader.readLine().split("\\.");
            String extension = parts[1];
            extensionMap.put(extension, extensionMap.getOrDefault(extension, 0) + 1);
        }

        List<String> extensions = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : extensionMap.entrySet()) {
            extensions.add(entry.getKey());
        }

        Collections.sort(extensions);

        for (String extension : extensions) {
            Integer count = extensionMap.get(extension);
            writer.write(extension + " " + count);
            writer.newLine();
        }

        writer.flush();
    }
}
