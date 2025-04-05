import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> inputs = new ArrayList<>();

        int maxLength = 0;
        for (int i = 0; i < 5; i++) {
            String line = reader.readLine();
            inputs.add(line);
            maxLength = Math.max(maxLength, line.length());
        }

        for (int i = 0; i < maxLength; i++) {
            for (String input : inputs) {
                if (i < input.length()) {
                    writer.append(input.charAt(i));
                }
            }
        }

        writer.flush();
    }
}
