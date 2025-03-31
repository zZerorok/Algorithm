import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> words = new HashSet<>();
        List<String> wordList = new ArrayList<>();

        int wordCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < wordCount; i++) {
            String word = reader.readLine();
            words.add(word);
            wordList.add(word);
        }

        for (String word : wordList) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            if (words.contains(reversedWord)) {
                int length = word.length();
                char middleChar = word.charAt(length / 2);

                writer.write(length + " " + middleChar);
                writer.flush();
                return;
            }
        }
    }
}
