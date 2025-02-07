import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        char[] chars = word.toUpperCase().toCharArray();


        Map<Character, Integer> map = new HashMap<>();
        for (char current : chars) {
            map.put(current, map.getOrDefault(current, 0) + 1);
        }

        int maxCount = Collections.max(map.values());

        List<Character> alphabets = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                alphabets.add(entry.getKey());
            }
        }

        System.out.println(alphabets.size() > 1 ? "?" : alphabets.get(0));
    }
}
