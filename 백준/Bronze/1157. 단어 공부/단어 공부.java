import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] upperChars = reader.readLine().toUpperCase().toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char current : upperChars) {
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
