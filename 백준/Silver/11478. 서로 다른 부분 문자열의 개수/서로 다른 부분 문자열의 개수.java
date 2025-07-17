import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> substrings = new HashSet<>();

        String input = reader.readLine();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                substrings.add(input.substring(i, j + 1));
            }
        }

        writer.write(String.valueOf(substrings.size()));
        writer.flush();
    }
}
