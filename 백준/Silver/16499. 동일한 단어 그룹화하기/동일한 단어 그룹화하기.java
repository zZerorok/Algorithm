import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> words = new HashMap<>();
        int wordCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < wordCount; i++) {
            String[] split = reader.readLine().split("");
            Arrays.sort(split);
            String sortedWord = Arrays.toString(split);
            words.put(sortedWord, words.getOrDefault(sortedWord, 0) + 1);
        }

        writer.write(String.valueOf(words.size()));
        writer.flush();
    }
}
