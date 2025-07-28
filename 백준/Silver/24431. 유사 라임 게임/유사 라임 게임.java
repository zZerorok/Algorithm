import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testcase; i++) {
            String[] input = reader.readLine().split(" ");
            int suffixLength = Integer.parseInt(input[2]);

            String[] inputWords = reader.readLine().split(" ");
            List<String> words = Arrays.asList(inputWords);

            int result = getMaxRhymePairs(words, suffixLength);

            writer.write(String.valueOf(result));
            writer.newLine();
        }

        writer.flush();
        writer.close();
        reader.close();
    }

    private static int getMaxRhymePairs(List<String> words, int length) {
        Map<String, List<String>> suffixGroups = new HashMap<>();
        for (String word : words) {
            String suffix = word.substring(word.length() - length);

            suffixGroups.putIfAbsent(suffix, new ArrayList<>());
            suffixGroups.get(suffix).add(word);
        }

        int pairs = 0;
        for (List<String> group : suffixGroups.values()) {
            pairs += group.size() / 2;
        }
        return pairs;
    }
}
