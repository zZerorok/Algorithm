import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = reader.readLine().split(" ");
        int wordCount = Integer.parseInt(input[0]);
        int maxWordLength = Integer.parseInt(input[1]);


        Map<String, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < wordCount; i++) {
            String word = reader.readLine();

            if (word.length() >= maxWordLength) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>(
                (a, b) -> {
                    if (!a.getValue().equals(b.getValue())) {
                        return b.getValue() - a.getValue();
                    }

                    if (b.getKey().length() != a.getKey().length()) {
                        return b.getKey().length() - a.getKey().length();
                    }

                    return a.getKey().compareTo(b.getKey());
                }
        );

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            queue.offer(entry);
        }

        StringBuilder builder = new StringBuilder();
        while (!queue.isEmpty()) {
            String word = queue.poll().getKey();
            builder.append(word).append(System.lineSeparator());
        }

        writer.write(builder.toString());
        writer.flush();
        writer.close();
    }
}
